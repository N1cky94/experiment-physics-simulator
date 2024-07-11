package be.archilios.experiment.engine;

import be.archilios.experiment.engine.gameloop.ARGBColor;
import be.archilios.experiment.engine.gameloop.Graphics;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.Vector2D;

import java.util.Collection;

public class Helpers {
    public static BoundingBox toBoundingBox(Vector2D location, int width, int height) {
        return new BoundingBox(location.getX(), location.getY(), width, height);
    }
    
    public static void drawBoundingBoxes(Collection<BoundingBox> boxes, Graphics graphics) {
        boxes.forEach(
                box -> {
                    graphics.drawRectangle(box.getX(), box.getY(), box.getWidth(), box.getHeight(), ARGBColor.RED);
                }
        );
    }
}
