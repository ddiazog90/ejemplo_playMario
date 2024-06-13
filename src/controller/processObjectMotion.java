package controller;
import view.lienzo;
public class processObjectMotion extends Thread {
	private lienzo lienzo;
	private int pm=5,pg=350;
	

	public processObjectMotion(view.lienzo lienzo) {
		super();
		this.lienzo = lienzo;
	}
	public void motionMario(int value) {
		pm+=value;
		lienzo.setXm1(pm);
		lienzo.repaint();
	}
	public void run() {
		for(int i=0;i<200;i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			lienzo.setXg1(pg--);
			lienzo.repaint();
			
		}
	}
	

}
