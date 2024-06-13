package controller;
import view.lienzo;
public class processCloudMotion extends Thread{
	
	private lienzo lienzo;

	public processCloudMotion(view.lienzo lienzo) {
		super();
		this.lienzo = lienzo;
	}
	private int getPositionY(int range) {
		return (int)(Math.random()*range);
	}
	public void run() {
		for(int i=0;i<30;i++) {
			lienzo.setXn1(i);
			lienzo.setYn1(getPositionY(100));
			lienzo.repaint();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==29) {
				i=0;
			}
		}
	}

}
