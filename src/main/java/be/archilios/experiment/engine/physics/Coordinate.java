package be.archilios.experiment.engine.physics;

import be.archilios.experiment.engine.physics.twodimensional.Vector2D;

public interface Coordinate<T extends Coordinate<T>> {
    T move(Vector2D vector);
    T move(int scalar);
}
