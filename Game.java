package hitIt;

import javax.swing.ImageIcon;

import com.threecoffee.anim.Sprite;
import com.threecoffee.control.GameWindow;

public class Game extends GameWindow {
	
	Paddle p;
	Wall leftw,rightw,roof;
	Ball b;
	//Random r;
	public int count;
	
	public Game() 
	{
		super(606, 420);
		
		//r=new Random();
		//r.nextInt(5);
		
		p=new Paddle();		//paddle
		p.addTo(this);
		p.play();			//adding and playing paddle
		count=0;
		Sprite bg = new Sprite();
		bg.addImage(new ImageIcon("media/paddle/bg.png"));
		bg.setLocation(0,0);
		bg.setDelay(200);
		bg.play();
		
		
		leftw = new Wall(Wall.WALL);
		leftw.addTo(this);
		leftw.setLocation(0,0);
		
		rightw = new Wall(Wall.WALL);
		rightw.addTo(this);
		rightw.setLocation(595,0);
		
		roof = new Wall(Wall.ROOF);
		roof.addTo(this);
		roof.setLocation(0,0);
		
		b=new Ball(10,10);
		b.addTo(this);
		
		Brick[] rb = new Brick [50];
		b.addCollider(p);
		b.addCollider(leftw);
		b.addCollider(rightw);
		b.addCollider(roof);
			
		
		int i,j=0;//j=0;
		//for(j=)
		int k,x=0,count=0;
		k=140;
		while(count<3)
		{
			i=150;
			while(x<10){
				i=i+25;
				rb[j] = new Brick();
				rb[j].addTo(this);
				rb[j].setLocation(i,k);
				b.addCollider(rb[j]);
				j++;
				x++;
			}
		x=0;
		k=k+10;
		count++;
		}
		bg.addTo(this);
		this.setVisible(true);
		
	}

	public static void main(String[] args)
	{
		new Game();
		
	}
}
