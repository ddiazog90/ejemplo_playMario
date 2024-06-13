package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.view_play;

public class logic_view_play implements ActionListener, KeyListener{
	
	private view_play vp;
	private processObjectMotion motion;
	private boolean flag=false;
	private processCloudMotion pcm;
	private int valueMotion=0;

	public logic_view_play(view_play vp) {
		super();
		this.vp = vp;
		this.vp.btn_pause.addActionListener(this);
		this.vp.btn_start.addActionListener(this);
		this.vp.btn_pause.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vp.btn_start) {
			motion=new processObjectMotion(vp.lienzo);
			pcm=new processCloudMotion(vp.lienzo);
			motion.start();
			pcm.start();
			
			vp.btn_start.setEnabled(false);
		}else if(e.getSource()==vp.btn_pause) {
			if(!flag) {
				vp.btn_pause.setText("RESUME");
				flag=true;
				motion.suspend();
				pcm.suspend();
			}else {
				vp.btn_pause.setText("PAUSE");
				flag=false;
				motion.resume();
				pcm.resume();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_LEFT) {
			System.out.println("Retroceder:"+valueMotion);
			motion.motionMario(valueMotion--);
		}else if(e.getKeyCode()==e.VK_RIGHT) {
			System.out.println("Adelantar:"+valueMotion);
			motion.motionMario(valueMotion++);
		}else if(e.getKeyCode()==e.VK_UP) {
			System.out.println("Salto");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
