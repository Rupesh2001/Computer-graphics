import javax.swing.*;
import java.awt.*;
import java.awt.Color;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class reflection extends JFrame
{
    int x[]={120,200,280};
    int y[]={130,50,130};   
        public reflection()                      
    {
        //jpanel create garni
        JPanel jp= new JPanel();
        getContentPane().add(jp);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        

    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 =(Graphics2D) g;
     
        //traingle
       // g2.setColor(Color.BLACK);
       /*  g2.drawLine(120, 130, 280, 130);
        g2.drawLine(120, 130, 200, 65);
        g2.drawLine(200, 65, 280, 130);   */                           
        //rect
        //g2.drawRect(x, y, width, height);
        g2.setColor(Color.green);
        g2.fillRect(120, 130, 160, 100);
        //window
        g2.setColor(Color.BLUE);
        g2.fillRect(140, 140, 50, 50);
        //door
        g2.setColor(Color.red);
        g2.drawRect(220, 140, 50, 80);
        g2.setColor(Color.red);
        g2.fillPolygon(x,y,3);
    }
    public static void main(String[] args) {
        new reflection();
    }
    
}