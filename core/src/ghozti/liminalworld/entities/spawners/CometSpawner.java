package ghozti.liminalworld.entities.spawners;

import com.badlogic.gdx.graphics.g2d.Batch;
import ghozti.liminalworld.entities.gameentities.Comet;
import ghozti.liminalworld.utils.Constants;

import java.util.ArrayList;

public class CometSpawner extends EntitySpawner{

    public CometSpawner(){
        spriteArrayList = new ArrayList<>();

        for (int i = 0; i < Constants.Comet.spawnAbleComets; i++){
            spriteArrayList.add(new Comet(320,220,1));
        }
    }

    @Override
    public void drawEntities(Batch batch) {

    }

    @Override
    public void entityOverlaps() {

    }

    @Override
    public void disposeEntities() {

    }

    @Override
    public void update() {

    }
}
