package be.archilios.experiment.engine.simulator;

public interface Image {
    int getWidth();
    int getHeight();
    Graphics.ImageFormat getFormat();
    void dispose();
}
