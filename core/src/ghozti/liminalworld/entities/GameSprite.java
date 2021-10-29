package ghozti.liminalworld.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public class GameSprite {

    //properties
    Texture texture;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height;
    Sprite sprite;

    public GameSprite(Texture texture, Rectangle rectangle, float[] position, float width, float height, Sprite sprite){
        this.texture = texture;
        this.hitbox = rectangle;
        this.position = position;
        this.width = width;
        this.height = height;

        hitbox.x = position[0];
        hitbox.y = position[1];
        hitbox.width = width;
        hitbox.height = height;

        this.sprite = sprite;
    }

}
