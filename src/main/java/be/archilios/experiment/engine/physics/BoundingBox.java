package be.archilios.experiment.engine.physics;

import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;

public class BoundingBox {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public BoundingBox(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public boolean collidesWith(BoundingBox box) {
        return x < box.getX() + box.getWidth() &&
                x + width > box.getX() &&
                y < box.getY() + box.getHeight() &&
                y + height > box.getY();
    }
    
    public boolean collidesWith(Coordinate2D location) {
        return location.x() > x &&
                location.x() < x + width &&
                location.y() > y &&
                location.y() < y + height;
    }
}
