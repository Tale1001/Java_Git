package aaaa;
import java.applet.*;
import java.awt.*;
import java.util.Date;

public class Clock1 extends Applet{
	public void paint(Graphics g)
	{
		Date timeNow = new Date();
		String strTime = timeNow.getHours() +":"
							+timeNow.getMinutes() +":" +timeNow.getSeconds();
		g.drawString(strTime, 100, 20);
	}
}
