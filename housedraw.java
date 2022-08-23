import javax.swing.*;

//import jdk.internal.org.jline.utils.Colors;

import java.awt.*;
//import java.awt.event.*;
//import java.awt.geom.Ellipse2D;
//import java.awt.color.*;

public class housedraw extends JFrame
{
        
        public housedraw()
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        setTitle("circle program");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
            
    }
    public void paint(Graphics g)
    {
		super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        //g2.setPaint(Color.red);
        //side 
        //g2.drawPolygon(200,130,200,150);
      //  g2.setColor(Color.red);
        g2.drawRect(280, 130,200, 250);
        //recatngle
        g2.drawRect( 120, 130, 160, 250);
        //rect to square DOOR
        g2.drawRect(150, 280,100, 100);
        //window
       // g2.setColor(Color.green); 
        g2.drawRect(170, 150,50, 50);
      //  g2.setPaint(color.pink);
      //circle
       g2.drawOval(180, 80, 40, 40);
     
        //traingle
        g2.drawLine(120, 130, 280, 130);
        g2.drawLine(120, 130, 200, 65);
        g2.drawLine(200, 65, 280, 130);                             
        //next door
        g2.drawRect( 340, 280,100, 100);
        //next window
          //window 
          g2.drawRect( 340, 150,50, 50);
          g2.drawRect( 380, 150,50, 50);
        
        
	} 
	public static void main(String[] args) {
        new housedraw();
    }
}

