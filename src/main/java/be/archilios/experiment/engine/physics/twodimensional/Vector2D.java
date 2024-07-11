package be.archilios.experiment.engine.physics.twodimensional;

import be.archilios.experiment.engine.physics.Vector;

public record Vector2D (double x, double y) implements Vector<Vector2D> {
    
    public static Vector2D zeroVector() {
        return new Vector2D(0, 0);
    }
    
    public int getX() {
        return Double.valueOf(x).intValue();
    }
    
    public int getY() {
        return Double.valueOf(y).intValue();
    }
    
    public Coordinate2D getAsScalarCoordinate() {
        return new Coordinate2D(
                getX(),
                getY()
        );
    }
    
    @Override
    public Vector2D addition(Vector2D vector) {
        return new Vector2D(
                x + vector.x(),
                y + vector.y()
        );
    }
    
    @Override
    public Vector2D subtract(Vector2D vector) {
        return new Vector2D(
                x - vector.x(),
                y - vector.y()
        );
    }
    
    @Override
    public Vector2D multiplyByScalar(double scalar) {
        return new Vector2D(
                x * scalar,
                y * scalar
        );
    }
    
    @Override
    public Vector2D divideByScalar(double scalar) {
        return new Vector2D(
                x / scalar,
                y / scalar
        );
    }
    
    @Override
    public double magnitude() {
        return Math.sqrt(x*x+y*y);
    }
    
    @Override
    public Vector2D normalize() {
        double magnitude = magnitude();
        if (isNotZeroVector()) {
            return divideByScalar(magnitude);
        } else {
            return this;
        }
    }
    
    private boolean isNotZeroVector() {
        return x != 0 &&
                y != 0;
    }
    
    
}
