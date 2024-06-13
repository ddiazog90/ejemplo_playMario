package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.logic_view_play;

import java.awt.Color;
import javax.swing.JButton;

public class view_play extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btn_start;
	public JButton btn_pause;
	public lienzo lienzo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_play frame = new view_play();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view_play() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 415);
		setResizable(false);
		setTitle("Mario UPS");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn_control = new JPanel();
		pn_control.setBackground(new Color(255, 128, 64));
		pn_control.setBounds(10, 14, 400, 44);
		contentPane.add(pn_control);
		pn_control.setLayout(null);
		
		btn_start = new JButton("START");
		btn_start.setBackground(Color.BLACK);
		btn_start.setForeground(new Color(255, 255, 255));
		btn_start.setBounds(112, 0, 85, 44);
		pn_control.add(btn_start);
		
		btn_pause = new JButton("PAUSE");
		btn_pause.setForeground(Color.WHITE);
		btn_pause.setBackground(Color.BLACK);
		btn_pause.setBounds(207, 0, 85, 44);
		pn_control.add(btn_pause);
		
		lienzo = new lienzo();
		lienzo.setBounds(10, 68, 400, 300);
		contentPane.add(lienzo);
		
		new logic_view_play(this);
	}
}
