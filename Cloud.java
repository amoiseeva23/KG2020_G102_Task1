package com.company;
import java.awt.*;
public class Cloud implements Drawable {
    private int x,y,w,h;
    Color c;
    public Cloud (int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics2D g) {
        //drawCentreCloud(g, 380, 70, 110, 60, c);
       // drawRightCloud(g,500,190,110,60,c);
        drawCentreCloud(g, x, y, w, h, c);
        drawRightCloud(g,x,y,w,h,c);

    }
    public static void drawCentreCloud (Graphics2D g, int x, int y, int w, int h, Color с) {
        g.setColor(Color.WHITE);
        g.fillOval(x+0,y+0,w+0,h+0);
        g.setColor(Color.WHITE);
        g.fillOval(x+10,y-5,w-70,h+7);
        g.setColor(Color.WHITE);
        g.fillOval(x+30,y-15,w-60,h+25);
        g.setColor(Color.WHITE);
        g.fillOval(x+60,y-5,w-70,h+7);}

    public static void drawRightCloud (Graphics2D g, int x, int y, int w, int h, Color c) {
        g.fillOval(x+0,y+0,w+0,h+0);
        g.setColor(Color.WHITE);
        g.fillOval(x+10,y-5,w-70,h+7);
        g.setColor(Color.WHITE);
        g.fillOval(x+30,y-15,w-60,h+25);
        g.setColor(Color.WHITE);
        g.fillOval(x+60,y-5,w-70,h+7);}}

