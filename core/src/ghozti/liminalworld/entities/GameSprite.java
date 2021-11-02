package ghozti.liminalworld.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameSprite {

    //properties
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height;
    Sprite sprite;
    public TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("atlas/sprites.atlas"));
    TextureRegion texture, debugTexture = atlas.findRegion("hitboxDebug");

    /*
        REQUIRED TO FILL IN v, OTHERWISE IT WILL CREATE A NULL EXCEPTION AND WILL CRASH THE PROGRAM
        THESE ARE JUST SETTERS AND GETTERS
     */

    public void setTexture(TextureRegion texture){
        this.texture = texture;
    }

    public void setHitbox(Rectangle rectangle){
        this.hitbox = rectangle;
    }

    public void setPosition(float[] position){
        this.position = position;
        this.hitbox.x = position[0];
        this.hitbox.y = position[1];
    }

    public void setWidth(float width){
        this.width = width;
        this.hitbox.width = this.width;
    }

    public void setHeight(float height){
        this.height = height;
        this.hitbox.height = this.height;
    }

    public void createSpite(Sprite sprite){
        this.sprite = sprite;
    }

    public TextureRegion getTexture() {
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

    public void drawSprite(Batch batch){
        sprite.draw(batch);
    }

    //override me
    public abstract void update();

    //override me
    public abstract void draw(SpriteBatch batch);

    public void drawHitboxes(Batch batch){
        batch.draw(debugTexture,getHitbox().x,getHitbox().y,getHitbox().width,getHitbox().height);
    }

}
