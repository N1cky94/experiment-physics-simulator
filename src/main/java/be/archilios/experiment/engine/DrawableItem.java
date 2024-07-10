package be.archilios.experiment.engine;

import be.archilios.experiment.engine.gameloop.Drawable;
import be.archilios.experiment.engine.physics.Item;
import be.archilios.experiment.engine.physics.Vector2;

public abstract class DrawableItem extends Item implements Drawable {
    public DrawableItem(Vector2 location) {
        super(location);
    }
    
    public DrawableItem(Vector2 location, float mass) {
        super(location, mass);
    }
}
