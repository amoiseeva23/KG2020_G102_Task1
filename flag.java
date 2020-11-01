package com.company;

import java.awt.*;
public class flag implements Drawable {
    private int x,y,w,h;
    private Color c;
    public flag (int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public  void draw(Graphics2D g) {

        drawflag(g,x, y, w, h, c);


    }
    public static void drawflag(Graphics2D g, int x, int y, int w, int h, Color c) {

        g.fillRect(x, y, w, h);
        g.setColor(Color.white);
        g.fillRect(x+7, y, w+53, h-150);
        g.setColor(Color.BLUE);
        g.fillRect(x+7,y+20,w+53,h-150);}}
