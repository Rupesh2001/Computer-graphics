import java.awt.Graphics;
import javax.swing.JFrame;
class RotationCounterClockwise extends JFrame{
int x1 = 100;
int y1 = 100;
int x2 = 200;
int y2 = 200;
int angle = 10;
double t = angle * Math.PI / 180;
int px1,px2,py1,py2;
public RotationCounterClockwise()
{
setTitle("kiran shrestha");
setSize(1000,1000);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
px1 = (int)(x1 * Math.cos(t) - y1 * Math.sin(t));
px2 = (int)(x2*Math.cos(t) - y2 * Math.sin(t));
py1 = (int)(y1*Math.cos(t) + x1*Math.sin(t));
py2 = (int)(y2*Math.cos(t) + x2*Math.sin(t));
setVisible(true);
}
public void paint(Graphics g)
{
g.drawLine(x1, y1, x2, y2);
g.drawLine(px1, py1, px2, py2);
}
public static void main(String args[])
{
new RotationCounterClockwise();
}
}