package be.archilios.experiment.game;

import be.archilios.experiment.engine.DrawableItem;
import be.archilios.experiment.engine.Helpers;
import be.archilios.experiment.engine.gameloop.Graphics;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Collisionable;
import be.archilios.experiment.engine.physics.Coordinate2D;

import java.util.Collection;
import java.util.Collections;

public class Floor extends DrawableItem implements Collisionable {
    private static final int HEIGHT = 20;
    private final int screenWidth;
    
    public Floor(Coordinate2D location, int screenWidth) {
        super(location);
        this.screenWidth = screenWidth;
    }
    
    @Override
    public void draw(Graphics graphic) {
        Helpers.drawBoundingBoxes(hitBoxes(), graphic);
        
    }
    
    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singletonList(Helpers.toBoundingBox(location, screenWidth, HEIGHT));
    }
}
