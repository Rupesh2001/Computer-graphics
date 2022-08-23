
import java.awt.Graphics;
import javax.swing.JFrame;
class Shear_Y extends JFrame{
int x1 = 0;
int y1 = 100;
int x2 = 0;
int y2 = 200;
int x3 = 200;
int y3 = 200;
int x4 = 200;
int y4 = 100;
int shy = 2;
int py1,py2,py3,py4;
public Shear_Y()
{
setTitle("Y- Direction shear of a rectangle");
setSize(1000,1000);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
py1 = y1 + x1*shy;
py2 = y2 + x2*shy;
py3 = y2 + x3*shy;
py4 = y4 + x4 * shy;
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
g.drawLine(x1, py1, x2, py2);
g.drawLine(x2, py2, x3, py3);
g.drawLine(x3, py3, x4, py4);
g.drawLine(x4, py4, x1, py1);
}
public static void main(String args[])
{
new Shear_Y();
}
}