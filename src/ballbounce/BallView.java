package ballbounce;


import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almas Asghar
 */
public class BallView extends JPanel {
    Ball bpos;
    Paddle lp,rp;
    Score sc;
    public BallView(Score s)
    {
        bpos=new Ball(20,20);
        lp=new Paddle(30,240,20,180);
        rp=new Paddle(830,240,20,180);
        sc=s;
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,900,600);
        g.setColor(Color.BLACK);
        g.fillOval(bpos.x, bpos.y, 50, 50);
        g.setColor(Color.black);
        g.fillRect(lp.x,lp.y, lp.width, lp.height);
        g.setColor(Color.black);
        g.fillRect(rp.x,rp.y, rp.width, rp.height);
        g.setFont(new Font("Times new Roman",Font.BOLD,15));
        g.drawString("Player2Score", 800   , 20);
        g.drawString("Player1Score", 10   , 20);
        g.drawString(String.valueOf(sc.getScr2()), 860   , 40);
        g.drawString(String.valueOf(sc.getScr1()), 20   , 40);
     
    }
}
