package ghozti.liminalworld.entities.spawners;

import com.badlogic.gdx.graphics.g2d.Batch;
import ghozti.liminalworld.entities.GameSprite;
import ghozti.liminalworld.entities.gameentities.Comet;
import ghozti.liminalworld.utils.Constants;

import java.util.ArrayList;
import java.util.Random;

public class CometSpawner extends EntitySpawner{

    int currentDrawn;

    public CometSpawner(){
        spriteArrayList = new ArrayList<>();
        int lastx = 50;
        for (int i = 0; i < Constants.Comet.spawnAbleComets; i++){
            spriteArrayList.add(new Comet((new Random().nextInt(1785 - 85) + 85) + lastx,1080,1));
        }
    }

    @Override
    public void drawEntities(Batch batch) {
        for(int i = 0; i < spriteArrayList.size(); i++){
            spriteArrayList.get(i).draw(batch);
            spriteArrayList.get(i).drawHitBox(batch);
        }
    }

    @Override
    public void entityOverlaps() {

    }

    @Override
    public void disposeEntities() {

    }

    @Override
    public void update() {
        entityOverlaps();
        for(int i = 0; i < spriteArrayList.size(); i++){
            spriteArrayList.get(i).updatePosition(0,-1);
            //spriteArrayList.get(i).getSprite().rotate(-.3f);
        }
    }
}
