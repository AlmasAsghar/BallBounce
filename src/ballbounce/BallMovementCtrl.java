/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballbounce;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Almas Asghar
 */
public class BallMovementCtrl implements Runnable,KeyListener {
     BallView bv;
     int minX,minY,maxY,maxX;
     int screenWidth,screenHeight;
     Dimension screen;
     int xspeed=1,yspeed=1;
     boolean up=false,down=true,right=true,left=false;
     BallArena ba;
     Thread t;
     public BallMovementCtrl(BallView b)
     {
        
         this.bv=b;
         screen=Toolkit.getDefaultToolkit().getScreenSize();
         screenHeight=(int)screen.getHeight();
         screenWidth=(int)screen.getWidth();
         maxX=860;
         minX=20;
         maxY=600;
         minY=20;    
 }
   
 public void passThread(Thread t1)
    {
        this.t=t1;
    }

    @Override
    public void run() {
     while(true)
     {
         if(down)
         {
             if(bv.bpos.gety()>=maxY-70)
             {
                 yspeed=-yspeed;
                 down=false;
                 up=true;
             }
             
         }
         if(up)
         {
             if(bv.bpos.gety()<=minY-30)
             {
                 yspeed=-yspeed;          //--+
                 down=true;
                 up=false;
             }
         }
          if(right)
         {
             if (bv.bpos.getx()+bv.rp.width+22==bv.rp.getX() && 
                     (bv.bpos.gety()>=bv.rp.getY()+22
                     && bv.bpos.gety()<=bv.rp.getY()+bv.rp.height+22))
             {
                 xspeed=-xspeed;
                 right=false;
                 left=true;
                 bv.sc.setScr2(bv.sc.getScr2()+1);
                 
             }
             else if (bv.bpos.getx()>=maxX)
             {
                   JOptionPane.showMessageDialog(null,"Game Over Player 1 Wins and Score "+(bv.sc.getScr1()+1));
                   bv.sc.setScr2(bv.sc.getScr2()+1);
                   System.exit(0);
             }
         }
         if(left)
         {
             if (bv.bpos.getx()-15==bv.lp.getX()-bv.lp.getWidth()
                     && 
                     (bv.bpos.gety()>=bv.lp.getY()
                     && bv.bpos.gety()<=bv.lp.getY()+bv.lp.height))
             {
                 xspeed=-xspeed;          //--+
                 right=true;
                 left=false;
                 bv.sc.setScr1(bv.sc.getScr1()+1);
             }
             else if(bv.bpos.getx()<=minX)
             {  
                 JOptionPane.showMessageDialog(null,"Game Over Player 2 Wins and Score "+(bv.sc.getScr2()+1));
                 bv.sc.setScr2(bv.sc.getScr2()+1);
                 System.exit(0);
              }
         }
         bv.bpos.sety((bv.bpos.gety()+yspeed));
         bv.bpos.setx((bv.bpos.getx()+xspeed));
         
         bv.repaint();
         bv.revalidate();
         try
         {
             Thread.sleep(8);
         }
         catch(Exception e){
         
         }
    }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
         if(e.getKeyCode()==KeyEvent.VK_S)
              {
                 t.suspend();
             }
         else if(e.getKeyCode()==KeyEvent.VK_R)
              {
                 t.resume();
             }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}