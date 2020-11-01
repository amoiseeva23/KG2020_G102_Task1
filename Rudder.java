package com.company;
import java.awt.*;
public class Rudder implements Drawable {
    private int x,y,w,h;
    private Color c;
    public Rudder (int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public  void draw(Graphics2D g) {
        //drawRudder(g,410, 330, 140, 20, Color.lightGray);
        drawRudder(g,x, y, w, h, c);

    }
    public static void drawRudder(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, w, h);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x+70, y-80, w-120, h+60);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x+40,y-80,w-107,h-15);
        g.fillRect(x-160, y+20, w+160, h);}

}
