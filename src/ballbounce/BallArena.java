package ballbounce;


import java.awt.event.KeyListener;
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
public class BallArena {
    JFrame fr;
    BallView bv;
    Ball bpos;
    BallMovementCtrl bc;
    Paddle leftPad,rightPad;
    PaddleMovementCtrl pc;
    Score s;
    
    public BallArena()
    {
        initGui();
    }
  public void initGui()
  {
          
             fr=new JFrame("GameScreen");
             s=new Score();
             bv=new BallView(s);
             bc=new BallMovementCtrl(this.bv);
             pc=new PaddleMovementCtrl(this.bv);
                
                
          
             fr.addKeyListener(pc);
             Thread t=new Thread(bc);
             t.start();
             bc.passThread(t);
             fr.addKeyListener(bc);

             fr.add(bv);
             fr.setSize(900,600);
             fr.setResizable(false);
             fr.setVisible(true);
             fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

                }  
}
