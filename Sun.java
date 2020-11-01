package com.company;
import java.awt.*;
public class Sun implements Drawable {
    private int x,y,r,R, n;

    public Sun(int x, int y, int r, int r1, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
        C = c;
    }

    private Color C;

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, 100, 100, 40, 60, 43, Color.red);

    }
    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int countLine, Color color) {
        g.setColor(color);
        g.fillOval(x - r, y - r, r * 2, r * 2);
        double da = 2 * Math.PI / countLine;
        for (int i = 0; i < countLine; i++) {
            double alpha = da * i;
            double x1 = r * Math.cos(alpha);
            double y1 = r * Math.sin(alpha);
            double x2 = R * Math.cos(alpha);
            double y2 = R * Math.sin(alpha);
            g.drawLine(x + (int) x1, y + (int) y1, x + (int) x2, y + (int) y2);
        }}
}
