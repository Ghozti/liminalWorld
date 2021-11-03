package ghozti.liminalworld.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameSprite {

    //properties
    Sprite sprite;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height, scale;
    Texture texture;

    //const
    public final TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("atlas/sprites.atlas"));
    public final Texture debugTexture = atlas.findRegion("hitboxDebug").getTexture();

    /*
        REQUIRED TO FILL IN v, OTHERWISE IT WILL CREATE A NULL EXCEPTION AND WILL CRASH THE PROGRAM
        THESE ARE JUST SETTERS AND GETTERS
     */

    public void createSprite(Sprite sprite){
        this.sprite = sprite;
    }

    public void createHitbox(Rectangle rectangle) {
        this.hitbox = rectangle;
    }

    public void setPosition(float[] position){
        this.position = position;
        sprite.setPosition(this.position[0],this.position[1]);
    }

    //actual image height
    public void setRegeonWidth(float width){
        sprite.setRegionWidth((int)width);
    }

    //actual image height
    public void setRegeonHeight(float height){
        sprite.setRegionHeight((int)height);
    }

    //scale will be multiplied to the width and height
    public void setScale(float scale){
        this.scale = scale;
        this.width = width * scale;
        this.height = height * scale;
        sprite.setScale(this.scale);
    }

    //GETTERS
    public void setTexture(TextureRegion texture){
        this.texture = texture.getTexture();
        sprite.setTexture(this.texture);
    }

    public Sprite getSprite() {
        return sprite;
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

    public float getScale() {
        return scale;
    }

    public Texture getTexture() {
        return texture;
    }

    //DRAWING STUFF
    public abstract void draw(Batch batch);

    public abstract void update(Batch batch);

    public void drawSprite(Batch batch){
        sprite.draw(batch);
    }

    public void drawHitBox(Batch batch){
        batch.draw(debugTexture,getPosition()[0],getPosition()[1], getWidth(),getHeight());
    }
}
