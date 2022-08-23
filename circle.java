import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 public class circle extends JFrame implements ActionListener
{
   
    JLabel radius;
    JTextField r;
    JLabel c1;
    JTextField xc;
    JLabel c2;
    JTextField yc;
    JButton btn;
    public circle()
    {
        radius=new JLabel("enter radius");
        r=new JTextField(5);
        c1=new JLabel("enter center xc");
        xc=new JTextField(10);
        c2=new JLabel("enter center yc");
        yc=new JTextField(10);
       // jtr=new JTextField(5);
        btn=new JButton("click me");

         add(radius);
         add(r);
         add(c1);
         add(xc);
         add(c2);
         add(yc);
        add(btn);
        btn.addActionListener(this);

        setVisible(true);
        setSize(600,700);
        setTitle("circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn)
        {
        new cline(r.getText(),xc.getText(),yc.getText());
         }
    }
    public static void main(String[] args) {
        new circle();
    }
    
}
