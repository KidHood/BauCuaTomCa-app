package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Timer;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel_animation extends JPanel implements ActionListener{
	final int WIGTH = 185;
	final int HEIGH  = 175;
	BauCuaView2 bauCuaView2;
	Image mam;
	Timer timer;
	int xVelocity = 5;
	int x = 0;
	
//	public MyPanel_animation(BauCuaView2 bauCuaView2) {
//
//		this.setBackground(null);
//		mam = new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("mam.png"))).getImage();
//		timer = new Timer(10, this);
//		timer.start();
//	}
	
	public MyPanel_animation() {
		//this.setPreferredSize(new Dimension(WIGTH, HEIGH));
		this.setBackground(null);
		mam = new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("mam.png"))).getImage();
		timer = new Timer(10, this);
		this.setDoubleBuffered(true);
		//timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D =  (Graphics2D) g;
		g2D.drawImage(mam, x, xVelocity, null);
		g2D.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		if(x < - mam.getWidth(null)) {
//			xVelocity = xVelocity * -1;
//		}
//			
//		x = x + xVelocity;	
//		repaint();	
//						
		}				
}
