package be.archilios.experiment.engine;

import be.archilios.experiment.engine.simulator.ARGBColor;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.physics.BoundingBox;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;

import java.util.Collection;

public class Helpers {
    public static BoundingBox toBoundingBox(Coordinate2D location, int width, int height) {
        return new BoundingBox(location.x(), location.y(), width, height);
    }
    
    public static void drawBoundingBoxes(Collection<BoundingBox> boxes, Graphics graphics) {
        boxes.forEach(
                box -> {
                    graphics.drawRectangle(box.getX(), box.getY(), box.getWidth(), box.getHeight(), ARGBColor.RED);
                }
        );
    }
}
