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
public class Paddle {
    int x,y,width,height;
    public Paddle(int x,int y,int w,int h)
    {
        this.x=x;
        this.y=y;
        this.width=w;
        this.height=h;
        
    }
    
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    
    
    
}
