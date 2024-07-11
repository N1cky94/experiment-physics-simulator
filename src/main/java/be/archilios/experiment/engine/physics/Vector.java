package be.archilios.experiment.engine.physics;

public interface Vector<T extends Vector<T>> {
    T addition(T vector);
    T subtract(T vector);
    T multiplyByScalar(double scalar);
    T divideByScalar(double scalar);
    double magnitude();
    T normalize();
}
