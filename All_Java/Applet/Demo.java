package Applet;
import java.applet.Applet;
import java.awt.Graphics;

//An applet is a small program that is intended not to be run on
// its own, but rather to be embedded inside another application.

public class Demo extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World!", 150,150);
    }
}

