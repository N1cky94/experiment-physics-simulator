package be.archilios.experiment.engine.simulator.javafx;

import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.Image;

import java.io.InputStream;

public class JavaFxImage implements Image {
    private javafx.scene.image.Image image;
    
    public JavaFxImage(String url) {
        this.image = new javafx.scene.image.Image(url);
    }
    
    public JavaFxImage(InputStream stream) {
        this.image = new javafx.scene.image.Image(stream);
    }
    
    @Override
    public int getWidth() {
        return Double.valueOf(image.getWidth()).intValue();
    }
    
    @Override
    public int getHeight() {
        return Double.valueOf(image.getHeight()).intValue();
    }
    
    @Override
    public Graphics.ImageFormat getFormat() {
        return Graphics.ImageFormat.RGB565;
    }
    
    @Override
    public void dispose() {
    
    }
    
    public javafx.scene.image.Image getImage() {
        return image;
    }
}
