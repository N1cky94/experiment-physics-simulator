package be.archilios.experiment.engine.gameloop;

public record ARGBColor (
        double alpha,
        int red,
        int green,
        int blue
) {
    public static final ARGBColor BLACK = new ARGBColor(1.0, 0, 0, 0);
    public static final ARGBColor WHITE = new ARGBColor(1.0, 255, 255, 255);
    public static final ARGBColor RED = new ARGBColor(1.0, 255, 0, 0);
    
    
}
