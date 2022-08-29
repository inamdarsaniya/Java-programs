import java.awt.*;
import java.applet.*;
/*
<applet code=ColorDemo.class Width=200 height=150>
</applet>
*/
public class ColorDemo extends Applet
{
public void paint(Graphics g)
{
Color green=new Color(255,0,0);
Color red=new Color(255,0,0);
Color yellow= new Color(0,0,255);
Color blue= new Color(255,255,0);
g.setColor(red);
g.drawLine(10,10,40,40);
g.setColor(green);
g.drawRect(10,60,20,20);
g.setColor(blue);
g.drawOval(80,10,40,40);
g.setColor(yellow);
g.fillArc(80,80,40,40,90,270);
}}