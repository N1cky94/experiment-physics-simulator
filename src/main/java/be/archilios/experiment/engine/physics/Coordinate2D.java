package be.archilios.experiment.engine.physics;

public record Coordinate2D (
        int x, int y
) implements Coordinate<Coordinate2D> {
    private static final Coordinate2D ZERO_POINT_2D = new Coordinate2D(0 , 0);
    
    public Coordinate2D move(Vector2D vector) {
        return new Coordinate2D(
                x + vector.getX(),
                y + vector.getY()
        );
    }
    
    public Coordinate2D move(int scalar) {
        return new Coordinate2D(
                x + scalar,
                y + scalar
        );
    }
    
    public static Coordinate2D zeroPoint() {
        return ZERO_POINT_2D;
    }
}
