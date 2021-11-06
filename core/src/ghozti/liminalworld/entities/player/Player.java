package ghozti.liminalworld.entities.player;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.input.InputController;
import ghozti.liminalworld.utils.Constants;

public class Player extends GameSprite {

    public Player(){
        createSprite(new Sprite(atlas.findRegion(Constants.Player.ship)));
        createHitbox(new Rectangle());
        setPosition(new float[]{Constants.Player.initX,Constants.Player.initY});
        setRegionWidth(Constants.Player.regionWidth);
        setRegionHeight(Constants.Player.regionHeight);
        setScale(Constants.Player.scale);
    }

    @Override
    public void draw(Batch batch) {
        drawSprite(batch);
        drawHitBox(batch);
    }

    @Override
    public void update() {
        if (InputController.getKey().equals("a")){
            updatePosition(-8,0);
            setTexture(atlas.findRegion(Constants.Player.shipActive));
        }else if(InputController.getKey().equals("d")){
            updatePosition(8,0);
            setTexture(atlas.findRegion(Constants.Player.shipActive));
        }else if (InputController.getKey().equals("w")){
            updatePosition(0,8);
            setTexture(atlas.findRegion(Constants.Player.shipActive));
        }else if(InputController.getKey().equals("s")){
            updatePosition(0,-8);
            setTexture(atlas.findRegion(Constants.Player.shipActive));
        } else {
            setTexture(atlas.findRegion(Constants.Player.ship));
        }
        validatePosition();
    }

    public void validatePosition(){

        if (getPosition()[1] > 485){
            getPosition()[1] = 485;
        }else if (getPosition()[1] < 85){
            getPosition()[1] = 85;
        }else if (getPosition()[0] > 1785){
            getPosition()[0] = 1785;
        }else if (getPosition()[0] < 65) {
            getPosition()[0] = 65;
        }
    }
}
