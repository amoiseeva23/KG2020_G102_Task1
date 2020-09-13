package com.company;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //корпус корабля
        gr.drawLine(300, 400, 500, 400);
        gr.drawLine(250, 350, 300, 400);
        gr.drawLine(500, 400, 550, 350);
        gr.drawLine(250, 350, 550, 350);
        //2 ehjdtym
        gr.setColor(Color.DARK_GRAY);
        gr.fillRect(250, 350, 300, 20);
        gr.setColor(Color.LIGHT_GRAY);
        //окна
        gr.setColor(Color.CYAN);
        gr.fillOval(320, 375, 20, 20);
        gr.fillOval(370,375,20,20);
        gr.fillOval(420,375,20,20);
        gr.fillOval(470,375,20,20);
        //inehdfk
        gr.setColor(Color.LIGHT_GRAY);
        gr.fillRect(410, 330, 140, 20);
        gr.fillRect(480, 250, 20, 80);
        gr.fillRect(450,250,33,5);
        //флаг
        gr.setColor(Color.BLACK);
        gr.fillRect(300, 200, 7, 170);
        gr.setColor(Color.white);
        gr.fillRect(307,200,60,20);
        gr.setColor(Color.BLUE);
        gr.fillRect(307,220,60,20);
        //центральное  облако
        gr.setColor(Color.WHITE);
        gr.fillOval(380,70,110,60);
        gr.setColor(Color.WHITE);
        gr.fillOval(390,65,40,67);
        gr.setColor(Color.WHITE);
        gr.fillOval(410,55,50,85);
        gr.setColor(Color.WHITE);
        gr.fillOval(440,65,40,67);
        //правое облако
        gr.fillOval(500,190,110,60);
        gr.setColor(Color.WHITE);
        gr.fillOval(510,185,40,67);
        gr.setColor(Color.WHITE);
        gr.fillOval(530,175,50,85);
        gr.setColor(Color.WHITE);
        gr.fillOval(560,185,40,67);
        // чайка
        gr.setColor(Color.BLACK);
        gr.drawLine(690, 40, 680, 60);
        gr.drawLine(680, 60, 720, 40);






        drawSun(gr, 100, 100, 40, 60, 43, Color.red);


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
        }


        }
    }
