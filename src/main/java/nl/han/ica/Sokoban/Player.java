package nl.han.ica.Sokoban;

import nl.han.ica.oopg.objects.SpriteObject;
import nl.han.ica.oopg.objects.Sprite;

public class Player extends SpriteObject{
	private Sokoban sokoban;
	Sprite left = new Sprite(Sokoban.MEDIA_URL.concat("Character1.png"));
	Sprite right = new Sprite(Sokoban.MEDIA_URL.concat("Character2.png"));
	Sprite up = new Sprite(Sokoban.MEDIA_URL.concat("Character7.png"));
	Sprite down = new Sprite(Sokoban.MEDIA_URL.concat("Character4.png"));
	public Player(Sokoban sokoban) {
		super(new Sprite(Sokoban.MEDIA_URL.concat("Character4.png")));
	}
	
	@Override
    public void keyPressed(int keyCode, char key) {
		final int moveDistance = 60;
        if (keyCode == sokoban.LEFT) {
            setX(this.x - moveDistance);
            super.switchSprite(left);
            
        }
        if (keyCode == sokoban.RIGHT) {
            setX(this.x + moveDistance);
            super.switchSprite(right);
          }
        if (keyCode == sokoban.UP) {
            setY(this.y - moveDistance);
            super.switchSprite(up);
          }
        if (keyCode == sokoban.DOWN) {
            setY(this.y + moveDistance);
            super.switchSprite(down);
          }
    }
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	;
	
	
}
