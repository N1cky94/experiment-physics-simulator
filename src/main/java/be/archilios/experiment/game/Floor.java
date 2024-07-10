package be.archilios.experiment.game;

import be.archilios.experiment.engine.DrawableItem;
import be.archilios.experiment.engine.Helpers;
import be.archilios.experiment.engine.gameloop.Graphics;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Collisionable;
import be.archilios.experiment.engine.physics.Vector2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Floor extends DrawableItem implements Collisionable {
    private static final int HEIGHT = 20;
    private int screenWidth;
    
    public Floor(Vector2 location, int screenWidth) {
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
