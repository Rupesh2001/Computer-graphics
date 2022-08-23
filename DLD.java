//<applet code="DLD.class" width="700" height="800"></applet>
//An applet for DLD
import java.awt.*;
//import java.applet.*;
import javax.swing.*;
//import java.awt.geom.Ellipse2D;
public class DLD extends JFrame{

	public void paint(Graphics g){
		double x1 = 700, y1=200, x2= 100, y2=700;
		double dx = x2-x1, dy = y2-y1, x, y;
		if(dx > dy)
		{
			//x is independent variable
			for(x=x1; x<=x2; x++){
				y = y1 + dy/dx*(x-x1);
				g.drawLine((int)x,(int)y,(int)x,(int)y); //plot the pixel
			}
		}else{
			//x is dependent variable
			for(y=y1; y<=y2; y++){
				x = x1 + dx/dy * (y-y1);
				g.drawLine((int)x,(int)y,(int)x,(int)y); //plot the pixel
			}
		}
	}
	public static void main(String[] args) {
		
		new DLD();
	}
}