package hitIt;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.threecoffee.anim.Sprite;
import com.threecoffee.control.GameWindow;

public class Paddle extends Sprite {

	Paddle(){
		this.setName("Paddle");
		this.addImage(new ImageIcon("media/paddle/paddle.png"));
		this.setLocation(200, 365);
		this.setDelay(20);
	
	}
	
	@Override
	public void update(){
	GameWindow w = this.getGameWindow();
		
		if(w.isKeyDown(KeyEvent.VK_LEFT) && this.getX()>5){
			this.moveSprite(-5, 0);}
		else if(w.isKeyDown(KeyEvent.VK_RIGHT) && this.getX()<395){
			this.moveSprite(5, 0);}
		}
	}

