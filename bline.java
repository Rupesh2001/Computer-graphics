import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.awt.geom.Ellipse2D;

public class bline extends JFrame
{
    int x1,x2,y1,y2;
    int dx,dy,p0=0,i;
    public bline(String x1,String x2,String y1, String y2)
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        setTitle("bresenhams algorithm");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.x1=Integer.parseInt(x1);
        this.y1=Integer.parseInt(y1);
        this.x2=Integer.parseInt(x2);
        this.y2=Integer.parseInt(y2);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        dx=x2-x1;
        dy=y2-y1;
		g2.draw(new Ellipse2D.Float(x1,y1,1,1));
        p0=2*dy-dx;
        for(i=0; i<dx; i++)
        {
            if(p0<0)
            {
                x1=x1+1;
                //g2.draw(new Ellipse2D.Float(x1,y1,2,2));
                g2.drawLine(x1, y1, x1, y1);
                p0=p0+2*dy;
               // System.out.println(p0);
            }
            else
            {
                x1=x1+1;
                y1=y1+1;
                //g2.draw(new Ellipse2D.Float(x1,y1,2,2));
                g2.drawLine(x1, y1, x1, y1);
                p0=p0+2*dy-2*dx;
              //  System.out.println(p0);
            }
        }
        
    }
   
}
