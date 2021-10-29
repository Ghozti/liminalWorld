package ghozti.liminalworld.entities.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;

import java.awt.*;

public class Player extends GameSprite {

    //properties
    Texture texture;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height;
    Sprite sprite;

    public Player(Texture texture, Rectangle rectangle, float[] position, float width, float height, Sprite sprite) {
        super(texture, rectangle, position, width, height, sprite);
    }
}
