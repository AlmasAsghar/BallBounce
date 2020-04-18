/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballbounce;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Almas Asghar
 */
public class PaddleMovementCtrl implements KeyListener{
     BallView bv;
     boolean isPaused=false;
     int minX,minY,maxY,maxX;
     int screenWidth,screenHeight;
     Dimension screen;
     public  PaddleMovementCtrl(BallView b)
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
         if(e.getKeyCode()==KeyEvent.VK_Z)
        {
            if(bv.lp.getY()>=maxY-210)
            {
                  bv.lp.setY(bv.lp.getY()-bv.lp.getHeight());
            }
            else
                bv.lp.setY(bv.lp.getY()+15);   
        }
         if(e.getKeyCode()==KeyEvent.VK_Q)
        {
               if(bv.lp.getY()<=minY-5)
            {
                 bv.lp.setY(bv.lp.getY()+bv.lp.getHeight());
            }
            
           bv.lp.setY(bv.lp.getY()-5);
        }
         if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            if(bv.rp.getY()>=maxY-210)
            {
                  bv.rp.setY(bv.rp.getY()-bv.rp.getHeight());
            }
            else
                bv.rp.setY(bv.rp.getY()+20);
        }
         if(e.getKeyCode()==KeyEvent.VK_UP)
        {
               if(bv.rp.getY()<=minY)
            {
                  bv.rp.setY(bv.rp.getY()+bv.rp.getHeight());
            }
            
            bv.rp.setY(bv.rp.getY()-20);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
