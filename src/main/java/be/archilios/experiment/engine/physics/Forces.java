package be.archilios.experiment.engine.physics;

import be.archilios.experiment.engine.physics.twodimensional.Vector2D;

public class Forces {
    public static final Vector2D GRAVITY = new Vector2D(0, 0.45);
    public static final Vector2D JUMP = new Vector2D(0, -15);
    public static final Vector2D PULL_WALL = new Vector2D(-1, 0);
    
    public static Vector2D gravity(Item drawable) {
        double x = GRAVITY.x();
        double y = GRAVITY.y();
        return new Vector2D(x, y * drawable.getMass());
    }
    
    
}
