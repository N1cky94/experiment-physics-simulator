package be.archilios.experiment.engine;

import be.archilios.experiment.engine.simulator.Drawable;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;
import be.archilios.experiment.engine.physics.Item;

public abstract class DrawableItem extends Item implements Drawable {
    public DrawableItem(Coordinate2D location) {
        super(location);
    }
    
    public DrawableItem(Coordinate2D location, float mass) {
        super(location, mass);
    }
}
