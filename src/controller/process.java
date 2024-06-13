package controller;
import view.lienzo;
public class process extends Thread {
	private lienzo lienzo;
	private int pm=5,pg=350;

	public process(view.lienzo lienzo) {
		super();
		this.lienzo = lienzo;
	}
	public void run() {
		for(int i=0;i<200;i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lienzo.setXm1(pm++);
			lienzo.setXg1(pg--);
			lienzo.repaint();
			
		}
	}
	

}
