package ghozti.liminalworld.entities.player;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.input.InputController;

public class Player extends GameSprite {

    public Player(){
        createSprite(new Sprite(atlas.findRegion("ship")));//TODO make this a constant
        createHitbox(new Rectangle());
        setPosition(new float[]{500,500});
        setRegionWidth(64);//TODO make this a constant
        setRegionHeight(64);//TODO make this a constant
        setScale(3);//TODO make this a constant
    }

    @Override
    public void draw(Batch batch) {
        drawSprite(batch);
        drawHitBox(batch);
    }

    @Override
    public void update() {
        if (InputController.getKey().equals("a")){
            updatePosition(-10,0);
            setTexture(atlas.findRegion("shipActive"));
        }else if(InputController.getKey().equals("d")){
            updatePosition(10,0);
            setTexture(atlas.findRegion("shipActive"));
        }else {
            setTexture(atlas.findRegion("ship"));
        }
    }
}
