package be.archilios.experiment.simulations.bodies;

import be.archilios.experiment.engine.DrawableItem;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.javafx.JavaFxImage;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Collisionable;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;

import java.util.Collection;
import java.util.Collections;

public class Cube extends DrawableItem implements Collisionable {
    private JavaFxImage image;
    
    public Cube(Coordinate2D location, double mass) {
        super(location, mass);
        
        image = new JavaFxImage(getClass().getClassLoader().getResourceAsStream("images/cube.png"));
    }
    
    public int getHeight() {
        return image.getHeight();
    }
    
    @Override
    public void draw(Graphics graphic) {
        graphic.drawImage(image, location.x(), location.y());
    }
    
    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singleton(new BoundingBox(location.x(), location.y(), image.getWidth(), image.getHeight()));
    }
}
