package ghozti.liminalworld.entities.gameentities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.utils.Constants;

public class Comet extends GameSprite {

    boolean destroyed, outOfBounds;

    public Comet(float initX, float initY, float scale){
        createSprite(new Sprite(atlas.findRegion(Constants.Comet.cometTexture)));
        createHitbox(new Rectangle());
        setPosition(new float[]{initX,initY});
        setRegionWidth(330);
        setRegionHeight(220);
        setScale(scale);
        setHitboxDimensions(210,200);
        setHitboxPosition(600,600);
        destroyed = false;
        outOfBounds = false;
    }

    @Override
    public void draw(Batch batch) {
        drawSprite(batch);
        drawHitBox(batch);
    }

    @Override
    public void update() {
        getSprite().rotate(-.5f);
    }
}
