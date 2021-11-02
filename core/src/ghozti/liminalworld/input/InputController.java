package ghozti.liminalworld.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class InputController {

    public static String getKey(){
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            return "a";
        }else if(Gdx.input.isKeyPressed(Input.Keys.D)){
            return "d";
        }
        return "";
    }
}
