package ballbounce;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almas Asghar
 */
public class Ball {
    int x,y;
    public Ball( int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setx(int xx)
    {
        this.x=xx;
    }
    public int getx()
    {
        return x;
    }
    
    public void sety(int yy)
    {
        this.y=yy;
    }
    public int gety()
    {
        return y;
    }
}
