import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bresenhams extends JFrame implements ActionListener
{
    JLabel m1,m2,m3,m4;
    JTextField x1,x2,y1,y2;
    JButton btn;
    
    public bresenhams()
    {
        m1=new JLabel("enter x1");
        x1=new JTextField(10);
        m2=new JLabel("enter x2");
        x2=new JTextField(10);
        m3=new JLabel("enter y1");
        y1=new JTextField(10);
        m4=new JLabel("enter y2");
        y2= new JTextField(10);
        btn=new JButton("draw line");

        btn.addActionListener(this);
        add(m1);add(x1);add(m2);add(x2);
        add(m3);add(y1);add(m4);add(y2);
        add(btn);
        
        setTitle("bresenhams algorithm");
        setSize(700,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        new bline(x1.getText(), x2.getText(), y1.getText(), y2.getText());
    }
    public static void main(String[] args) {
        new bresenhams();
    }
}
