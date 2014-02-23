package hitIt;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.threecoffee.anim.Sprite;

public class Ball extends Sprite {

	int xvel,yvel;
		Ball(int xvel,int yvel)
	{
		this.setName("ball");
		
		this.xvel=xvel;
		this.yvel=yvel;
		
		
		this.addImage(new ImageIcon("media/paddle/ball.png"));
		this.setLocation(300, 300);
		this.play();
		//JLabel
		//this.setDelay(18);
	}
	
	

public void update(){
	if(getY()>400)
	{
		this.setVisible(false);
		this.stop();
	}
	this.moveSprite(xvel, yvel);
	}


@Override
public void collided(Sprite s){
	if(s.getName().equals("Brick"))
	{
		s.setVisible(false);
		s.stop();
		//count++;
	}
	
	
	else if(s.getName().equals("Roof") || s.getName().equals("Paddle")){
				
		if(s.getName().equals("Roof"))//collided with roof
		{
			this.setLocation(getX(),getHeight()+1);
		}
		
	
		else if(this.getY()+this.getHeight()>s.getY()+15)
		{
			this.setVisible(false);
			this.stop();	
		}
		yvel*=-1;
	}

	else if(s.getName().equals("Wall")){
	
	
	if(xvel>5)
	{
		this.setLocation(s.getX()-1,getY());	
	}
	else if(xvel<5)
	{
		this.setLocation(s.getWidth()+1,getY());	
	}
	
	xvel*=-1;
		}
}
}
