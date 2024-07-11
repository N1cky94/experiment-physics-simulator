package be.archilios.experiment.engine.physics;

public interface Coordinate<T extends Coordinate<T>> {
    T move(Vector2D vector);
    T move(int scalar);
}
