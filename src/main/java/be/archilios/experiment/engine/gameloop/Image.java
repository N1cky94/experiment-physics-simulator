package be.archilios.experiment.engine.gameloop;

public interface Image {
    int getWidth();
    int getHeight();
    Graphics.ImageFormat getFormat();
    void dispose();
}
