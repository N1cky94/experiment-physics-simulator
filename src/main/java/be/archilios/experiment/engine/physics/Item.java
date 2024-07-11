package be.archilios.experiment.engine.physics;

public abstract class Item {
    private static final float DEFAULT_MASS = 1;
    
    protected Coordinate2D location;
    protected Vector2D velocity;
    protected Vector2D acceleration;
    private final float mass;
    
    public Item(Coordinate2D location) {
        this(location, DEFAULT_MASS);
    }
    
    public Item(Coordinate2D location, float mass) {
        this.location = location;
        this.mass = mass;
        this.velocity = new Vector2D(0, 0);
        this.acceleration = new Vector2D(0, 0);
    }
    
    public void applyForce(Vector2D force) {
        acceleration.add(force.divideByScalar(this.mass));
    }
    
    public void update() {
        velocity.add(acceleration);
        location = location.move(velocity);
        
        //revert to 0
        acceleration.mult(0);
    }
    
    public Coordinate2D getLocation() {
        return location;
    }
    
    public Vector2D getVelocity() {
        return velocity;
    }
    
    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }
    
    public Vector2D getAcceleration() {
        return acceleration;
    }
    
    public float getMass() {
        return mass;
    }
}
