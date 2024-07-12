package be.archilios.experiment.engine.physics;

import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;
import be.archilios.experiment.engine.physics.twodimensional.Vector2D;

public abstract class Item {
    private static final float DEFAULT_MASS = 1;
    
    protected Coordinate2D location;
    protected Vector2D velocity;
    protected Vector2D acceleration;
    private final double mass;
    
    public Item(Coordinate2D location) {
        this(location, DEFAULT_MASS);
    }
    
    public Item(Coordinate2D location, double mass) {
        this.location = location;
        this.mass = mass;
        this.velocity = Vector2D.zeroVector();
        this.acceleration = Vector2D.zeroVector();
    }
    
    public void applyForce(Vector2D force) {
        Vector2D accelerationFromForce = force.divideByScalar(this.mass);
        acceleration = acceleration.addition(accelerationFromForce);
    }
    
    public void applyReversingForce(Vector2D force) {
        Vector2D currentVelocity = this.getVelocity();
        this.velocity = currentVelocity.multiplyByScalar(-1);
    }
    
    public void update() {
        velocity = velocity.addition(acceleration);
        location = location.move(velocity);
        
        acceleration = Vector2D.zeroVector();
    }
    
    public Coordinate2D getLocation() {
        return location;
    }
    
    public Vector2D getVelocity() {
        return velocity;
    }
    
    public void stopMovement() {
        velocity = Vector2D.zeroVector();
    }
    
    public void stopVerticalMovement() {
        velocity = new Vector2D(velocity.getX(), 0);
    }
    
    public void stopHorizontalMovement() {
        velocity = new Vector2D(0, velocity.getY());
    }
    
    public Vector2D getAcceleration() {
        return acceleration;
    }
    
    public double getMass() {
        return mass;
    }
    
    @Override
    public String toString() {
        return "Item{" +
                "location=" + location +
                ", velocity=" + velocity +
                ", acceleration=" + acceleration +
                ", mass=" + mass +
                '}';
    }
}
