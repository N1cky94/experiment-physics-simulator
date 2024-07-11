package be.archilios.experiment.engine.physics;

public class Forces {
    public static final Vector2D GRAVITY = new Vector2D(0, 0.45f);
    public static final Vector2D JUMP = new Vector2D(0, -15f);
    public static final Vector2D PULL_WALL = new Vector2D(-1f, 0);
    
    public static Vector2D gravity(Item drawable) {
        float x = GRAVITY.getXFloat();
        float y = GRAVITY.getYFloat();
        return new Vector2D(x, y * drawable.getMass());
    }
    
    public static Vector2D fullStop() {
        return new Vector2D(0, 0);
    }
}
