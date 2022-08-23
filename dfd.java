import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.geom.Ellipse2D;

class dfd extends JFrame implements ActionListener
{
    JLabel x;
    JTextField xt;
    JLabel xx;
    JTextField x2;
    JLabel y;
    JTextField yt;
    JLabel yy;
    JTextField y2;
    JButton draw;
    public dfd()
    {
        x=new JLabel("enter value of x1");
        xt=new JTextField(10);
        xx=new JLabel("enter value of x2");
        x2=new JTextField(10);
        y=new JLabel("enter value of y1");
        yt=new JTextField(10);
        yy=new JLabel("enter value of y2");
        y2=new JTextField(10);
        draw=new JButton("draw line");


        add(x);
        add(xt);
        add(xx);
        add(x2);
        add(y);
        add(yt);
        add(yy);
        add(y2);
        add(draw);

        draw.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        new dfd();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        new figuredfd(xt.getText(),x2.getText(),yt.getText(),y2.getText());
    }
}