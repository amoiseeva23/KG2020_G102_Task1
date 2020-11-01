package com.company;

import java.awt.*;
public class Waves implements Drawable {
    private int x,y,w,h,n;
    private Color c;
    public Waves (int x, int y, int w, int h,int n,Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;

    }
    @Override
    public  void draw(Graphics2D g) {
        drawWaves(g,x, y,w, h,n, c);

    }
    public static void drawWaves(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        for (int i = 0; i < n; i++) {
            g.setColor(Color.cyan);
            g.fillOval(x+i*w, y, w, h);
        }
    }}