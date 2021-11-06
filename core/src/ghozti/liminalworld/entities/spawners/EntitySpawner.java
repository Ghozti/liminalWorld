package ghozti.liminalworld.entities.spawners;

import com.badlogic.gdx.graphics.g2d.Batch;
import ghozti.liminalworld.entities.GameSprite;

import java.util.ArrayList;

public abstract class EntitySpawner {

    ArrayList<GameSprite> entityList;

    public abstract void drawEntities(Batch batch);

    public abstract void entityOverlaps();

    public abstract void disposeEntities();
}
