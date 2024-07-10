package be.archilios.experiment.engine.gameloop.javafx;

import be.archilios.experiment.engine.gameloop.*;
import be.archilios.experiment.engine.gameloop.Graphics;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

import java.awt.*;

public abstract class JavaFxGame extends Application implements Game {
    private JavaFxGameRenderer renderer;
    private Graphics graphics;
    private Audio audio;
    private Input input;
    private FileIO fileIO;
    private Screen screen;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(width, height);
        canvas.setFocusTraversable(true);
        
        input = new JavaFxInput(canvas);
        graphics = new JavaFxGraphics(canvas);
        screen = getInitScreen();
        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        
        primaryStage.setOnShowing(
                shown -> {
                    System.out.println("SHOWN");
                    renderer = new JavaFxGameRenderer(this);
                    renderer.resume();
                }
        );
        
        primaryStage.show();
        
    }
    
    @Override
    public Audio getAudio() {
        return null;
    }
    
    @Override
    public Input getInput() {
        return input;
    }
    
    @Override
    public FileIO getFileIO() {
        return fileIO;
    }
    
    @Override
    public Graphics getGraphics() {
        return graphics;
    }
    
    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    
    @Override
    public Screen getCurrentScreen() {
        return screen;
    }
    
    @Override
    public Screen getInitScreen() {
        return null;
    }
}
