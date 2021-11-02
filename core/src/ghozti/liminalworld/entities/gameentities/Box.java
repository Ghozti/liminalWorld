package ghozti.liminalworld.entities.gameentities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;

public class Box extends GameSprite {

    public Box(){
        setTexture(new Texture("box.png"));
        setHitbox(new Rectangle());
        setPosition(new float[]{500,500});
        setWidth(180);
        setHeight(20);
        createSpite(new Sprite(getTexture(),(int)getPosition()[0],(int)getPosition()[1],(int)getWidth(),(int)getHeight()));
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(getTexture(),getPosition()[0],getPosition()[1],getWidth(),getHeight());
    }
}
