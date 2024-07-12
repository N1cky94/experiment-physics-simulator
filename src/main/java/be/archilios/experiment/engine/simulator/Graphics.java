package be.archilios.experiment.engine.simulator;

public interface Graphics {
    enum ImageFormat {
        ARGB8888, ARGB4444, RGB565
    }
    
    Image newImage(String fileName, ImageFormat format);
    void clearScreen(ARGBColor color);
    void drawLine(int x, int y, int x2, int y2, ARGBColor color);
    void drawRectangle(int x, int y, int width, int height, ARGBColor color);
    void drawCircle(int x, int y, int radius, ARGBColor color);
    void drawImage(Image image, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight);
    void drawImage(Image image, int x, int y);
    void drawString(String text, int x, int y, ARGBColor color);
    int getWidth();
    int getHeight();
    void drawARGB(int i, int j, int k, int l);
}
