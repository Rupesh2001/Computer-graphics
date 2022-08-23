
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
class translation extends JFrame{
int x1 = 60;
int y1 = 60;
int x2 = 120;
int y2 = 120;
int tx = 210;
int  ty = 210;
int px1,px2,py1,py2;
public translation()
{
setTitle("kiran shrestha");
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
px1 = x1+tx;
px2 = x2+tx;
py1 = y1+ty;
py2 = y2+ty;
setVisible(true);
}
public void paint(Graphics g)
{
g.drawLine(x1, y1, x2, y2);
g.setColor(Color.black);
g.drawLine(px1, py1, px2, py2);
}
public static void main(String args[])
{
new translation();
}
}