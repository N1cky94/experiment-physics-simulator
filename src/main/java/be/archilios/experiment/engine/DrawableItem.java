package be.archilios.experiment.engine;

import be.archilios.experiment.engine.gameloop.Drawable;
import be.archilios.experiment.engine.physics.Coordinate2D;
import be.archilios.experiment.engine.physics.Item;
import be.archilios.experiment.engine.physics.Vector2D;

public abstract class DrawableItem extends Item implements Drawable {
    public DrawableItem(Coordinate2D location) {
        super(location);
    }
    
    public DrawableItem(Coordinate2D location, float mass) {
        super(location, mass);
    }
}
