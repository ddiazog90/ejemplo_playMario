package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_play;

public class logic_view_play implements ActionListener{
	
	private view_play vp;

	public logic_view_play(view_play vp) {
		super();
		this.vp = vp;
		this.vp.btn_pause.addActionListener(this);
		this.vp.btn_start.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vp.btn_start) {
			process hilo=new process(vp.lienzo);
			hilo.start();
		}else if(e.getSource()==vp.btn_pause) {
			
		}
	}
	

}
