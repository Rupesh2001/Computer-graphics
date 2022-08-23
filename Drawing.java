import java.awt.*;
//import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class Drawing extends JFrame
{
    int x0,y0,r,p,x1,x2,y1,y2;
    float dy, dx, x,y,m;
    
    
    public Drawing(String x1,String y1,String x2, String y2)
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
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        dx = x2-x1;
        dy = y2-y1;
        
        if(Math.abs(dx)>Math.abs(dy))
        {
            m=dy/dx;
            if(dx>0)
            {
                for(int i=x1; i<=x2; i++)
                {
                    y = y1+(m*(i-y1));
                    g2.draw(new Ellipse2D.Float(i,y,1,1));
                }
            }
            else
            {
                for(int i=y2; i<=y1; i++)
                {
                    y=y1+(m*(i-y1));
                    g2.draw(new Ellipse2D.Float(i,y,1,1));
                }
            }
        }
        else{
            if(dy>0)
            {
                m=dx/dy;
                for(int i=y1;i<=y2;i++)
                {
                    x=x1+(m *(i-y1));
                    g2.draw(new Ellipse2D.Float(x,i,1,1));
                }
            }
            else
            {
                for(int i=y1;i>=y2;i--)
                {
                    x=x1+(m*(i-y1));
                    g2.draw(new Ellipse2D.Float(x,i,1,1));
                }
            }
        }
        
    }  
            
}
