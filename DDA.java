import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DDA extends JFrame implements ActionListener
{
    JLabel msgx1, msgx2, msgy1, msgy2;
    JTextField tx1, tx2, ty1, ty2;
    JButton bt1;
    
    public DDA()
    {
        setLayout(new FlowLayout());
        msgx1=new JLabel("Enter x1");
        msgy1=new JLabel("Enter y1");
        msgx2=new JLabel("Enter x2");
        msgy2=new JLabel("Enter y2");
        tx1 = new JTextField(20);
        ty1 = new JTextField(20);
        tx2 = new JTextField(20);
        ty2 = new JTextField(20);
        bt1=new JButton("Draw");
        
        bt1.addActionListener(this);
        
        add(msgx1);
        add(tx1);
        add(msgy1);
        add(ty1);
        add(msgx2);
        add(tx2);
        add(msgy2);
        add(ty2);
        add(bt1);
        
        setTitle("RUPESH MAHAT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024,760);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new DDA();
    }

  
    public void actionPerformed(ActionEvent ae) 
    {
       new ddadrawing(tx1.getText(),ty1.getText(),tx2.getText(),ty2.getText());
    }
}