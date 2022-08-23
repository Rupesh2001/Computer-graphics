import java.awt.Graphics;
import javax.swing.JFrame;
class originreflection extends JFrame{
int x1 = 100;
int y1 = 100;
int x2 = 200;
int y2 = 200;
int px1,px2,py1,py2;
public originreflection()
{
setTitle("RUPESH MAHAT");
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
px1 = -x1+550;
px2 = -x2+550;
py1 = -y1+550;
py2 = -y2+550;
setVisible(true);
}
public void paint(Graphics g)
{
g.drawLine(x1, y1, x2, y2);
g.drawLine(px1, py1, px2, py2);
}
public static void main(String args[])
{
new originreflection();
}
}