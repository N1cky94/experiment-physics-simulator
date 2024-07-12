package be.archilios.experiment.engine.physics;

import be.archilios.experiment.engine.physics.twodimensional.Vector2D;

public class Forces {
    public static final Vector2D GRAVITATIONAL_ACCELERATION = new Vector2D(0, 0.45);
    public static final Vector2D WIND_ACCELERATION = new Vector2D(0.15, 0);
    public static final double DEFAULT_AIR_RESISTANCE = 0.5;
    public static final Vector2D JUMP = new Vector2D(0, -15);
    public static final Vector2D PULL_WALL = new Vector2D(-1, 0);
    
    public static Vector2D gravity(Item drawable) {
        return GRAVITATIONAL_ACCELERATION.multiplyByScalar(drawable.getMass());
    }
    
    public static Vector2D wind(Item item, double airResistance) {
        return WIND_ACCELERATION.multiplyByScalar(item.getMass())
                .subtract(
                        WIND_ACCELERATION.multiplyByScalar(airResistance)
                );
    }
    
    public static Vector2D wind(Item item) {
        return wind(item, DEFAULT_AIR_RESISTANCE);
    }
    
    
}
