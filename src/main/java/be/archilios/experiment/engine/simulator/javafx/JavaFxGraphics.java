package be.archilios.experiment.engine.simulator.javafx;

import be.archilios.experiment.engine.simulator.ARGBColor;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.Image;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class JavaFxGraphics implements Graphics {
    private final Canvas canvas;
    private final GraphicsContext context;
    
    public JavaFxGraphics(Canvas canvas) {
        this.canvas = canvas;
        context = canvas.getGraphicsContext2D();
    }
    
    @Override
    public Image newImage(String fileName, ImageFormat format) {
        return null;
    }
    
    @Override
    public void clearScreen(ARGBColor color) {
        context.setFill(convert(color));
        context.fillRect(0,0,getWidth(), getHeight());
    }
    
    @Override
    public void drawLine(int x, int y, int x2, int y2, ARGBColor color) {
    
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height, ARGBColor color) {
        context.setFill(convert(color));
        context.fillRect(x, y, width, height);
    }
    
    @Override
    public void drawCircle(int x, int y, int radius, ARGBColor color) {
        context.setFill(convert(color));
        context.fillOval(x, y, radius, radius);
    }
    
    @Override
    public void drawImage(Image image, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight) {
    
    }
    
    @Override
    public void drawImage(Image image, int x, int y) {
        javafx.scene.image.Image javaImage = ((JavaFxImage) image).getImage();
        context.drawImage(javaImage, x, y);
    }
    
    @Override
    public void drawString(String text, int x, int y, ARGBColor color) {
        context.setFont(Font.font("Verdana", 30));
        context.setFill(convert(color));
        context.fillText(text, x, y);
    }
    
    @Override
    public int getWidth() {
        return (int) canvas.getWidth();
    }
    
    @Override
    public int getHeight() {
        return (int) canvas.getHeight();
    }
    
    @Override
    public void drawARGB(int i, int j, int k, int l) {
    
    }
    
    private Color convert(ARGBColor color) {
        return Color.rgb(color.red(), color.green(), color.blue(), color.alpha());
    }
}
