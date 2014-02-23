package hitIt;

import javax.swing.ImageIcon;

import com.threecoffee.anim.Sprite;

public class Wall extends Sprite {
	
	
	static final int WALL=1;
	static final int ROOF=2;
	
	Wall(int type){
		if(type==WALL)
		{this.addImage(new ImageIcon("media/paddle/wall.png"));
		this.setName("Wall");}
		else if(type==ROOF)
		{this.addImage(new ImageIcon("media/paddle/roof.png"));
		this.setName("Roof");}
		this.play();

}
}