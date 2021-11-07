package ghozti.liminalworld.entities.gameentities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.utils.Constants;

public class Comet extends GameSprite {

    public Comet(float initX, float initY, float scale){
        createSprite(new Sprite(atlas.findRegion(Constants.Comet.cometTexture)));
        createHitbox(new Rectangle());
        setPosition(new float[]{500,500});
        setRegionWidth(330);
        setRegionHeight(220);
        setScale(1);
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
