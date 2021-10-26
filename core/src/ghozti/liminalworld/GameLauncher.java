package ghozti.liminalworld;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import org.w3c.dom.Text;

public class GameLauncher implements Screen {

    //screen
    Camera camera;
    Viewport viewport;
    SpriteBatch batch;

    //background
    Texture texture;
    int bgOffset;

    public GameLauncher(){
        camera = new OrthographicCamera();
        viewport = new StretchViewport(1920,1080,camera);
        batch = new SpriteBatch();
        texture = new Texture("Untitled.png");
        bgOffset = 0;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        batch.begin();
        //render here
        bgOffset++;
        if (bgOffset == 980) bgOffset = 0;

        batch.draw(texture,0,-bgOffset,1920,1080);
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

    }
}
