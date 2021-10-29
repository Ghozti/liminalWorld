package ghozti.liminalworld.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import org.w3c.dom.Text;

public class GameSprite {

    //properties
    Texture texture;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height;
    Sprite sprite;

    public void setTexture(Texture texture){
        this.texture = texture;
    }

    public void setHitbox(Rectangle rectangle){
        this.hitbox = rectangle;
    }

    public void setPosition(float[] position){
        this.position = position;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public void createSpite(Sprite sprite){
        this.sprite = sprite;
    }

    public Texture getTexture() {
        return texture;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public float[] getPosition() {
        return position;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Sprite getSprite() {
        return sprite;
    }
}
