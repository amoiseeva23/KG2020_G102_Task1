package com.company;
import java.awt.*;
public class Ship implements Drawable {
    private int x1,y1,x2,y2;
    private Color c;
    public Ship (int x1, int y1, int x2, int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public  void draw(Graphics2D g) {
        //drawShip(g,300, 400, 500, 400, Color.BLACK);
        drawShip(g,x1, x2, y1, y2, c);

    }
    public static void drawShip(Graphics2D g, int x1, int x2, int y1, int y2, Color c) {
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1-50, y1-50, x2-200, y2);
        g.drawLine(x1+200, y1, x2+50, y2-50);
        g.drawLine(x1-50, y1-50, x2+50, y2-50);
        }

}