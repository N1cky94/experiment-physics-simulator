package be.archilios.experiment.simulations.bodies;

import be.archilios.experiment.engine.DrawableItem;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Collisionable;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;
import be.archilios.experiment.engine.simulator.ARGBColor;
import be.archilios.experiment.engine.simulator.Graphics;

import java.util.Collection;
import java.util.Collections;

public class Ball extends DrawableItem implements Collisionable {
    private static final double DEFAULT_RADIUS = 50;
    public static final double DEFAULT_MASS = 2;
    
    private final double radius;
    
    public Ball(Coordinate2D location, double mass, double radius) {
        super(location, mass);
        this.radius = radius;
    }
    
    public Ball(Coordinate2D location, double mass) {
        this(location, mass, DEFAULT_RADIUS);
    }
    
    public Ball(Coordinate2D location) {
        this(location, DEFAULT_MASS);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getHeight() {
        return radius*2;
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.drawCircle(location.x(), location.y(), (int) radius, ARGBColor.RED);
    }
    
    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singleton(new BoundingBox(location.x(), location.y(), (int) radius, (int) radius));
    }
}
