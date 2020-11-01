package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;



public class DrawPanel extends JPanel {
    private static Random rnd = new Random();
    private Sun s = new Sun(rnd.nextInt(100) + 100, 100, 40, 60, 43, Color.red);
    private Cloud centre = new Cloud(380, 70, 110, 60, Color.WHITE);//центральное облако
    private Cloud right = new Cloud(500, 190, 110, 60, Color.WHITE);//правое облако
    private Ship sh1 = new Ship(300, 400, 500, 400, Color.BLACK);// корпус корабля
    private Rudder rud = new Rudder(410, 330, 140, 20, Color.lightGray);//штурвал
    private flag fl = new flag(300, 200, 7, 170, Color.white);//флаг
    private Bird b = new Bird(680, 60, 690, 40, Color.BLACK);//чайка
    private Bird d = new Bird(500, 60, 510, 40, Color.BLACK);
    private Text t = new Text(50, 500, Color.DARK_GRAY);
    private Windows w = new Windows(320, 375, 20, 20, 4, Color.CYAN);//окно
    private Waves wv = new Waves(0,400,115,100,8,   Color. CYAN);


    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        centre.draw(gr);
        sh1.draw(gr);

        right.draw(gr);
        rud.draw(gr);
        fl.draw(gr);
        s.draw(gr);
        b.draw(gr);
        d.draw(gr);
        w.draw(gr);
        wv.draw(gr);
        gr.fillRect(0, 440, 800, 150);
        t.draw(gr);

    }

    }






