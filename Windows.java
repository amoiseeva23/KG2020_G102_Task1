package com.company;

import java.awt.*;
public class Windows implements Drawable {
    private int x,y,w,h,n;
    private Color c;
    public Windows (int x, int y, int w, int h,int n,Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;

    }
    @Override
    public  void draw(Graphics2D g) {
        drawWindows(g,x, y,w, h,n, c);

    }
    public static void drawWindows(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.CYAN);

        for (int i = 0; i < n; i++) {
            g.fillOval((x + 5) + w * i + 25 * i, y, w, h);
        }
    }}