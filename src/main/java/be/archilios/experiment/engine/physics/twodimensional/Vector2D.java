package be.archilios.experiment.engine.physics.twodimensional;

import be.archilios.experiment.engine.physics.Vector;

public class Vector2D implements Vector<Vector2D> {
    private float x;
    private float y;
    
    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public Vector2D addition(Vector2D vector) {
        return new Vector2D(
                x + vector.getXFloat(),
                y + vector.getYFloat()
        );
    }
    
    @Override
    public Vector2D subtract(Vector2D vector) {
        return new Vector2D(
                x - vector.getXFloat(),
                y - vector.getYFloat()
        );
    }
    
    @Override
    public Vector2D multiplyByScalar(double scalar) {
        return new Vector2D(
                x * (float) scalar,
                y * (float) scalar
        );
    }
    
    @Override
    public Vector2D divideByScalar(double scalar) {
        return new Vector2D(
                x / (float) scalar,
                y / (float) scalar
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
    
    public int getX() {
        return Float.valueOf(x).intValue();
    }
    
    public int getY() {
        return Float.valueOf(y).intValue();
    }
    
    public float getXFloat() {
        return x;
    }
    
    public float getYFloat() {
        return y;
    }
    
    public static Vector2D zeroVector() {
        return new Vector2D(0, 0);
    }
}
