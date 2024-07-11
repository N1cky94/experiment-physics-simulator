package be.archilios.experiment.engine.physics;

public class Vector2D implements Vector<Vector2D> {
    private float x;
    private float y;
    
    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    Vector2D copy() {
        return new Vector2D(x, y);
    }
    
    void add(Vector2D v) {
        x += v.x;
        y += v.y;
    }
    
    @Override
    public Vector2D addition(Vector2D vector) {
        return new Vector2D(
                x + vector.getXFloat(),
                y + vector.getYFloat()
        );
    }
    
    void sub(Vector2D v) {
        x -= v.x;
        y -= v.y;
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
    
    public void mult(float n) {
        x *= n;
        y *= n;
    }
    
    @Override
    public Vector2D divideByScalar(double scalar) {
        return new Vector2D(
                x / (float) scalar,
                y / (float) scalar
        );
    }
    
    public void div(float n) {
        x /= n;
        y /= n;
    }
    
    public static Vector2D mult(Vector2D vector, float n) {
        return new Vector2D(vector.getXFloat() * n, vector.getYFloat() * n);
    }
    
    @Override
    public double magnitude() {
        return Math.sqrt(x*x+y*y);
    }
    
    float mag() {
        return (float) Math.sqrt(x*x+y*y);
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
    
    
    void norm() {
        float m = mag();
        if (m != 0) {
            div(m);
        }
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
    
    public void limit(float max) {
        float mag = mag();
        if (mag > max) {
            float ratio = max / mag;
            mult(ratio);
        }
    }
    
    public static Vector2D zeroVector() {
        return new Vector2D(0, 0);
    }
}
