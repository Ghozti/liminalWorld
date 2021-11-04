package ghozti.liminalworld.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ghozti.liminalworld.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 120;
		config.backgroundFPS = 120;
		config.height = 1080;
		config.width = 1920;
		new LwjglApplication(new Game(), config);
	}
}
