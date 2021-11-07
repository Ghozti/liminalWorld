package ghozti.liminalworld.entities.gameentities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.utils.Constants;

public class Comet extends GameSprite {

    boolean destroyed, outOfBounds;

    //TODO work on hitbox width/height/x/y scaling due to sprite scale, work on making comets spawn a certain distance from each other and work on a more efficient game sprite and comet spawner/ comet class

    public Comet(float initX, float initY, float scale){
        createSprite(new Sprite(atlas.findRegion(Constants.Comet.cometTexture)));
        createHitbox(new Rectangle());
        setPosition(new float[]{initX,initY});
        setRegionWidth(330);
        setRegionHeight(220);
        setScale(scale);
        setHitboxDimensions(210,150);
        setHitboxOffset(43,30);
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
        updatePosition(0,-1);
    }
}
