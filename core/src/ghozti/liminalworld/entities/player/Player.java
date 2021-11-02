package ghozti.liminalworld.entities.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;

import java.awt.*;

public class Player extends GameSprite {

    public Player(){
        setTexture(new Texture("testasset.png"));
        setHitbox(new Rectangle());
        setPosition(new float[] {50,50});
        setWidth(250);
        setHeight(250);
        createSpite(new Sprite(getTexture(),(int)getPosition()[0],(int)getPosition()[1],(int)getWidth(),(int)getHeight()));
    }

    @Override
    public void update() {
        getSprite().setPosition(getPosition()[0],getPosition()[1]);
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(getTexture(),getPosition()[0],getPosition()[1],getWidth(),getHeight());
        drawHitboxes(batch);
    }
}
