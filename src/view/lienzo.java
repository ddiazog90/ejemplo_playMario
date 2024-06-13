package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class lienzo extends JPanel implements parametrizable{
	private int xm1,ym1,xg1,yg1,xn1,yn1;
	private int wm1,hm1,wg1,hg1;
	private ImageIcon fondo, nube, mario, gomba;
	public lienzo() {
		
		repaint();
		//Imagenes del juego
		fondo=new ImageIcon(getClass().getResource(pathFondo));
		nube=new ImageIcon(getClass().getResource(pathNube));
		mario=new ImageIcon(getClass().getResource(pathMario));
		gomba=new ImageIcon(getClass().getResource(pathGomba));
		//Datos de posicion, ancho y alto de mario
		xm1=5;
		ym1=175;
		wm1=50;
		hm1=80;
		//Datos de posicion de la nube
		xn1=10;
		yn1=10;
		//Datos de gomba
		xg1=350;
		yg1=205;
		wg1=50;
		hg1=50;
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		//Fondo del juego
		g2.drawImage(fondo.getImage(), 0, 0, 400, 300, null);
		//Nubes
		for(int i=0;i<400;i+=80) {
//			g2.drawImage(nube.getImage(), xn1+i, (int)(Math.random()*100), 50, 50, null);
			g2.drawImage(nube.getImage(), xn1+i, yn1, 50, 50, null);
			
		}
		//Mario
		g2.drawImage(mario.getImage(), xm1, ym1, wm1, hm1, null);
		//Gomba
		g2.drawImage(gomba.getImage(), xg1, yg1, wg1, hg1, null);
		
		if(getCollision()) {
			wm1=50;
			hm1=40;
			ym1=215;
		}
		
	}
	private boolean getCollision() {
		Rectangle obj1=new Rectangle(xm1,ym1,wm1,hm1);//mario
		Rectangle obj2=new Rectangle(xg1,yg1,wg1,hg1);//gomba
		return obj1.intersects(obj2);
	}
	public int getXm1() {
		return xm1;
	}
	public void setXm1(int xm1) {
		this.xm1 = xm1;
	}
	public int getYm1() {
		return ym1;
	}
	public void setYm1(int ym1) {
		this.ym1 = ym1;
	}
	public int getXg1() {
		return xg1;
	}
	public void setXg1(int xg1) {
		this.xg1 = xg1;
	}
	public int getYg1() {
		return yg1;
	}
	public void setYg1(int yg1) {
		this.yg1 = yg1;
	}
	public int getXn1() {
		return xn1;
	}
	public void setXn1(int xn1) {
		this.xn1 = xn1;
	}
	public int getYn1() {
		return yn1;
	}
	public void setYn1(int yn1) {
		this.yn1 = yn1;
	}
	
	
	

}
