package be.archilios.experiment.engine.physics;

public abstract class Item {
    private static final float DEFAULT_MASS = 1;
    
    protected Vector2 location;
    protected Vector2 velocity;
    protected Vector2 acceleration;
    private final float mass;
    
    public Item(Vector2 location) {
        this(location, DEFAULT_MASS);
    }
    
    public Item(Vector2 location, float mass) {
        this.location = location;
        this.mass = mass;
        this.velocity = new Vector2(0, 0);
        this.acceleration = new Vector2(0, 0);
    }
    
    public void applyForce(Vector2 force) {
        Vector2 forceCopy = force.copy();
        forceCopy.div(mass);
        acceleration.add(forceCopy);
    }
    
    public void update() {
        velocity.add(acceleration);
        location.add(velocity);
        
        //revert to 0
        acceleration.mult(0);
    }
    
    public Vector2 getLocation() {
        return location;
    }
    
    public void setLocation(Vector2 location) {
        this.location = location;
    }
    
    public Vector2 getVelocity() {
        return velocity;
    }
    
    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }
    
    public Vector2 getAcceleration() {
        return acceleration;
    }
    
    public float getMass() {
        return mass;
    }
}
