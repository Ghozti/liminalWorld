package ghozti.liminalworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import ghozti.liminalworld.entities.gameentities.Comet;
import ghozti.liminalworld.entities.player.Player;

public class GameLauncher implements Screen {

    //screen
    Camera camera;
    Viewport viewport;
    SpriteBatch batch;

    //background
    TextureAtlas atlas;
    TextureRegion region;
    int bgOffset;
    Player player;
    Comet comet;

    public GameLauncher(){
        camera = new OrthographicCamera();
        viewport = new StretchViewport(1920,1080,camera);
        batch = new SpriteBatch();
        bgOffset = 0;

        //atlas and regions
        atlas = new TextureAtlas(Gdx.files.internal("atlas/sprites.atlas"));
        region = atlas.findRegion("bg");

        player = new Player();
        comet = new Comet();
    }

    @Override
    public void show() {

    }

    public void update(){
        player.update();
        comet.update();
    }

    @Override
    public void render(float delta) {
        update();
        ScreenUtils.clear(0, 0, 0, 1);
        batch.begin();
        //render here
        bgOffset++;
        if (bgOffset % 1080 == 0) bgOffset = 0;

        //bg
        batch.draw(region,0,-bgOffset,1920,1080);
        batch.draw(region,0,-bgOffset+1080,1920,1080);

        //comet
        comet.draw(batch);
        //player
        player.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height,true);//tells the viewport to update accordingly
        batch.setProjectionMatrix(camera.combined);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        atlas.dispose();
        batch.dispose();
    }
}
