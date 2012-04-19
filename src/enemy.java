import java.util.*;
import java.awt.*;
import javax.swing.*;
public class enemy extends JPanel
{
	private int size, x,y, dx, dy, bx, by, dbx, dby, numBombs;
	private Random gen;
	private Image im;


	public enemy(int x1, int y1, String f) 
    {
    	size = 25;
    	dx = 0;
    	dy = 0;
    	bx = -1;
    	by = -1;
    	dbx = 2;
    	dby = 2;
    	x = x1;
    	y = y1;
    	numBombs = 5;
    	ImageIcon ii=new ImageIcon(f);
    	im=ii.getImage();
    }
    
    public void moveLeft()
    {	
    	dx = -1;
    	if (x<=5)
    		x = 850;
    }
    public void moveRight()
    {
    	dx = 1;
    		if (x >= 850)
    			x = 6;
    }
    
    public void draw(Graphics gr)
    {
    	x += dx;
		gr.drawImage(im, x, y, size, size, Color.black, this);
	}
	
public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	public int getBX()
	{
		return bx;
	}
public int getBY()
{
	return by;
}
    
}