/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballbounce;

/**
 *
 * @author Almas Asghar
 */
public class Score {
    int scr1,scr2;
    public Score()
    {
        scr1=0;
        scr2=0;
    }
    public void setScr1(int s1)
    {
         this.scr1=s1;
    }
    public int getScr1()
    {
        return scr1;
    }
     public void setScr2(int s2)
    {
        this.scr2=s2;
    }
    public int getScr2()
    {
        return scr2;
    }
}
