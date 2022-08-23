import java.awt.*;
//import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class figuredfd extends JFrame
{
    int x0,y0,r,p,xt,x2,yt,y2;
    float dy, dx, x,y,m;
    
    
    public figuredfd(String xt,String x2,String yt,String y2)
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        setTitle("Example");
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.xt=Integer.parseInt(xt);
        this.yt=Integer.parseInt(yt);
        this.x2=Integer.parseInt(x2);
        this.y2=Integer.parseInt(y2);

    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        dx = x2-xt;
        dy = y2-yt;
        
        if(Math.abs(dx)>Math.abs(dy))
        {
            m=dy/dx;
            if(dx>0)
            {
                for(int i=xt; i<=x2; i++)
                {
                    y = yt+(m*(i-yt));
                    g2.draw(new Ellipse2D.Float(i,y,1,1));
                }
            }
            else
            {
                for(int i=y2; i<=yt; i++)
                {
                    y=yt+(m*(i-yt));
                    g2.draw(new Ellipse2D.Float(i,y,1,1));
                }
            }
        }
        else{
            if(dy>0)
            {
                m=dx/dy;
                for(int i=yt;i<=y2;i++)
                {
                    x=xt+(m *(i-yt));
                    g2.draw(new Ellipse2D.Float(x,i,1,1));
                }
            }
            else
            {
                for(int i=yt;i>=y2;i--)
                {
                    x=xt+(m*(i-yt));
                    g2.draw(new Ellipse2D.Float(x,i,1,1));
                }
            }
        }
        
    }  
            
}