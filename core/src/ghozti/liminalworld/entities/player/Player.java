package ghozti.liminalworld.entities.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

import java.awt.*;

public class Player {

    //properties
    Texture texture;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height;
    Sprite sprite;

    public Player(){
        this.texture = new Texture("untitled.png");
        this.hitbox = new Rectangle();
        this.position = new float[] {0,0};
        this.width = 150;
        this.height = 150;

        hitbox.x = position[0];
        hitbox.y = position[1];
        hitbox.width = width;
        hitbox.height = height;

        sprite = new Sprite(texture,(int)position[0],(int)position[1],(int)width,(int)height);
    }

    public void drawSprite(Batch batch){
        sprite.draw(batch);
    }
}
