package aaaa;

import java.applet.*;
import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Clock2 extends Applet {
	public void start(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 0; i<10; i++){
			try{
				Thread.sleep(1000);
				System.out.println(new Date());
				repaint();
			}catch(Exception e){}
		}
	}
	public void paint(Graphics g){
		Date timeNow = new Date();
//		while(true){
			try{
				String strTime = timeNow.getHours() +":" +timeNow.getMinutes()
											+":" + timeNow.getSeconds();
				g.drawString(strTime, 100, 20);
//				Thread.sleep(1000);
			}catch(Exception e){}
			
//		}
	}
}
