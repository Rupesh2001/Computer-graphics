
import java.awt.Graphics;
import javax.swing.JFrame;
class Shear_x extends JFrame{
int x1 = 50;
int y1 = 0;
int x2 = 100;
int y2 = 0;
int x3 = 100;
int y3 = 100;
int x4 = 50;
int y4 = 100;
int shx = 2;
int px1,px2,px3,px4;
public Shear_x()
{
setTitle("kiran shrestha");
setSize(1000,1000);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
px1 = x1 + y1*shx;
px2 = x2 + y2*shx;
px3 = x3+ y3 *shx;
px4 = x4+ y4 * shx;
setVisible(true);
}
public void paint(Graphics g)
{
//before shear
g.drawLine(x1, y1, x2, y2);
g.drawLine(x2, y2, x3, y3);
g.drawLine(x3, y3, x4, y4);
g.drawLine(x4, y4, x1, y1);
//after shear
g.drawLine(px1, y1, px2, y2);
g.drawLine(px2, y2, px3, y3);
g.drawLine(px3, y3, px4, y4);
g.drawLine(px4, y4, px1, y1);
}
public static void main(String args[])
{
new Shear_x();
}
}
