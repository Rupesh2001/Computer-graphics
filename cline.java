import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.awt.geom.Ellipse2D;

public class cline extends JFrame
{
    int r,xc,yc,x=0,y;
    int p;
    public cline(String r,String xc,String yc)
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        setTitle("circle program");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.r=Integer.parseInt(r);
        this.xc=Integer.parseInt(xc);
        this.yc=Integer.parseInt(yc);       
    }
    public void paint(Graphics g)
    {
        int cPointx = 450+xc;
		int cPointy = 450+yc;
		y=r;
		super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        g2.draw(new Ellipse2D.Double(cPointx,cPointy+r,10,10));
		g2.draw(new Ellipse2D.Double(cPointx,cPointy-r,10,10));
		g2.draw(new Ellipse2D.Double(cPointy+r,cPointx,10,10));
		g2.draw(new Ellipse2D.Double(cPointy-r,cPointx,10,10));
		// g2.drawLine(cPointx, cPointy+r, cPointx, cPointy+r);
		// g2.drawLine(cPointx, cPointy-r, cPointx, cPointy-r);
		// g2.drawLine(cPointx+r, cPointy, cPointx+r, cPointy);
		// g2.drawLine(cPointx-r, cPointy, cPointx-r, cPointy);	
        p=1-r;
        do
		{	
			if(p<0)
			{
				x=x+1;
				p=p+(2*x)+1;
			}
			else
			{
				x=x+1;
				y=y-1;
				p=p+(2*x+1)+1-(2*y+1);
			}
			g2.draw(new Ellipse2D.Double(cPointx+x,cPointy+y,10,10));
			g2.draw(new Ellipse2D.Double(cPointx+x,cPointy-y,10,10));
			g2.draw(new Ellipse2D.Double(cPointx-x,cPointy+y,10,10));
			g2.draw(new Ellipse2D.Double(cPointx-x,cPointy-y,10,10));
			g2.draw(new Ellipse2D.Double(cPointx+y,cPointy+x,10,10));
			g2.draw(new Ellipse2D.Double(cPointx+y,cPointy-x,10,10));
			g2.draw(new Ellipse2D.Double(cPointx-y,cPointy+x,10,10));
			g2.draw(new Ellipse2D.Double(cPointx-y,cPointy-x,10,10));
			
			// g2.drawLine(x,y,xc,yc);
			// g2.drawLine(xc+x,yc+y,5,5);
			// g2.drawLine(xc+x,yc-y,5,5);
			// g2.drawLine(xc-x,yc+y,5,5);
			// g2.drawLine(xc-x,yc-y,5,5);
			// g2.drawLine(xc+y,yc+x,5,5);
			// g2.drawLine(xc+y,yc-x,5,5);
			// g2.drawLine(xc-y,yc+x,5,5);
			// g2.drawLine(xc-y,yc-x,5,5);
        }
        while(x<=y);
		/*else
        {
			y=y-1;
			p=p+2*x+1-2*y;       
			g2.drawLine(x,y,xc,yc);
			g2.drawLine(xc+x,yc+y,5,5);
			g2.drawLine(xc+x,yc-y,5,5);
			g2.drawLine(xc-x,yc+y,5,5);
			g2.drawLine(xc-x,yc-y,5,5);
			g2.drawLine(xc+y,yc+x,5,5);
			g2.drawLine(xc+y,yc-x,5,5);
			g2.drawLine(xc-y,yc+x,5,5);
			g2.drawLine(xc-y,yc-x,5,5);
		}*/
	} 

    
}

