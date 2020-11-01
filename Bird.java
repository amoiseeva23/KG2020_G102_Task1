package com.company;

import java.awt.*;
public class Bird implements Drawable {
    private int x1,y1,x2,y2;
    private Color c;
    public Bird (int x1, int y1, int x2, int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public  void draw(Graphics2D g)
    {
        //drawBird(g,690, 40, 680, 60, Color.BLACK);
        drawBird(g,x1, x2, y1, y2, c);
    }
    public static void drawBird (Graphics2D g, int x1, int x2, int y1, int y2, Color c) {
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x2+40, y2-10);
    }

}