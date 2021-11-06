package ghozti.liminalworld.utils;

public class Constants {

    public static class Debug{
        public final static boolean debugMode = true;
    }

    public static class World{
        public final static float width = 1920;
        public final static float height = 1080;
    }

    public static class Player{

        //texture regions
        public final static String ship = "ship";
        public final static String shipActive = "shipActive";

        //position and dimensions
        public final static float regionWidth = 64;
        public final static float regionHeight = 64;
        public final static float scale = 3;
        public final static float initX = 500;
        public final static float initY = 500;
    }

    public static class Comet {
        //texture regions
        public final static String cometTexture = "comet";
    }
}
