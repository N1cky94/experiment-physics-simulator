package be.archilios.experiment.game;

import be.archilios.experiment.engine.DrawableItem;
import be.archilios.experiment.engine.gameloop.Graphics;
import be.archilios.experiment.engine.gameloop.javafx.JavaFxImage;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Collisionable;
import be.archilios.experiment.engine.physics.Vector2;

import java.util.Collection;
import java.util.Collections;

public class Cube extends DrawableItem implements Collisionable {
    private JavaFxImage image;
    
    public Cube(Vector2 location, float mass) {
        super(location, mass);
        
        image = new JavaFxImage(getClass().getClassLoader().getResourceAsStream("images/cube.png"));
    }
    
    public int getHeight() {
        return image.getHeight();
    }
    
    @Override
    public void draw(Graphics graphic) {
        graphic.drawImage(image, location.getX(), location.getY());
    }
    
    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singleton(new BoundingBox(location.getX(), location.getY(), image.getWidth(), image.getHeight()));
    }
}
