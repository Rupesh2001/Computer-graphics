import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class ddadrawing extends JFrame
{
    int i,m,x1,x2,y1,y2,step,dy, dx;
    double x, y, xinc, yinc;
 
    public ddadrawing(String x1,String y1,String x2, String y2)
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        setTitle("Example");
        setSize(1024,768);
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
        dx = x2-x1;
        dy = y2-y1;
        if(Math.abs(dx)>Math.abs(dy))
        {
            step = Math.abs(dx);
        }
        else
        {
            step = Math.abs(dy);
        }
        xinc=dx/step;
        yinc=dy/step;
            for(i=0;i<step;i++)
            {
                x=x+xinc;
                y=y+yinc;
                g2.draw(new Ellipse2D.Double(x,y,1,1));
            }
                for(m=0;m<step;m++)
              {
                    x=x+xinc;
                    y=y+yinc;
                    g2.draw(new Ellipse2D.Double(x,y,1,1));
                }

                if(Math.abs(dx)<Math.abs(dy))
                {
                   
                    step = Math.abs(dy);
                }
                else
                {
                    step = Math.abs(dx);
                }
                xinc=dx/step;
                yinc=dy/step;
                    for(i=0;i<step;i++)
                    {
                        x=x+xinc;
                        y=y+yinc;
                        g2.draw(new Ellipse2D.Double(x,y,1,1));
                    }
                        for(m=0;m<step;m++)
                        {
                            x=x+xinc;
                            y=y+yinc;
                            g2.draw(new Ellipse2D.Double(x,y,1,1));
                        }
           
        
    }  
            
}

