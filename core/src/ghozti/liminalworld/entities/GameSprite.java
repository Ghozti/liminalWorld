package ghozti.liminalworld.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.utils.Constants;

public abstract class GameSprite {

    //properties
    Sprite sprite;
    com.badlogic.gdx.math.Rectangle hitbox;
    float[] position;
    float width, height, scale, unScaledWidth, unscaledHeight;
    float hitBoxOffSetX = 0, hitBoxOffSetY = 0;
    TextureRegion texture;

    //const
    public TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("atlas/sprites.atlas"));
    public TextureRegion debugTexture = atlas.findRegion("hitboxDebug");

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
        hitbox.x = position[0];
        hitbox.y = position[1];
    }

    //actual image height
    public void setRegionWidth(float width){
        unScaledWidth = width;
        sprite.setRegionWidth((int)width);
        this.width = width;
    }

    //actual image height
    public void setRegionHeight(float height){
        unscaledHeight = height;
        sprite.setRegionHeight((int)height);
        this.height = height;
    }

    //scale will be multiplied to the width and height
    public void setScale(float scale){
        this.scale = scale;
        this.width = width * scale;
        this.height = height * scale;
        sprite.setScale(this.scale);
        hitbox.width = width;
        hitbox.height = height;
    }

    public void setHitboxDimensions(float width, float height){
        hitbox.width = width;
        hitbox.height = height;
    }

    public void setHitboxOffset(float x, float y){
        hitBoxOffSetX = x;
        hitBoxOffSetY = y;
    }

    public void updatePosition(float xChange, float ychange){
        position[0] += xChange;
        position[1] += ychange;
        sprite.setPosition(position[0], position[1]);
        hitbox.x = position[0];
        hitbox.y = position[1];
    }

    public void teleport(float x, float y){
        getSprite().setPosition(x,y);
    }

    //GETTERS
    public void setTexture(TextureRegion texture){
        this.texture = texture;
        sprite.setRegion(texture);
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

    public TextureRegion getTexture() {
        return texture;
    }

    //DRAWING STUFF
    public abstract void draw(Batch batch);

    public abstract void update();

    public void drawSprite(Batch batch){
        sprite.draw(batch);
    }

    public void drawHitBox(Batch batch){
        if (Constants.Debug.debugMode) {
            batch.draw(debugTexture, hitbox.x + hitBoxOffSetX, hitbox.y + hitBoxOffSetY, hitbox.width, hitbox.height);
        }
    }

    public void drawHitBox(Batch batch, boolean scaleDown){
        if (Constants.Debug.debugMode) {
            batch.draw(debugTexture, (hitbox.x + hitBoxOffSetX) - width/scale, (hitbox.y + hitBoxOffSetY) - height/scale, hitbox.width, hitbox.height);
        }
    }
}
