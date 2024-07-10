package be.archilios.experiment.engine.physics;

public class Vector2 {
    private float x;
    private float y;
    
    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    Vector2 copy() {
        return new Vector2(x, y);
    }
    
    void add(Vector2 v) {
        x += v.x;
        y += v.y;
    }
    
    void sub(Vector2 v) {
        x -= v.x;
        y -= v.y;
    }
    
    public void mult(float n) {
        x *= n;
        y *= n;
    }
    
    public void div(float n) {
        x /= n;
        y /= n;
    }
    
    public static Vector2 mult(Vector2 vector, float n) {
        return new Vector2(vector.getXFloat() * n, vector.getYFloat() * n);
    }
    
    float mag() {
        return (float) Math.sqrt(x*x+y*y);
    }
    
    void normalize() {
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
    
    public static Vector2 zero() {
        return new Vector2(0, 0);
    }
}
