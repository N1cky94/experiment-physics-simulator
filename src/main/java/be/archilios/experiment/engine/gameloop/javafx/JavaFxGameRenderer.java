package be.archilios.experiment.engine.gameloop.javafx;

import be.archilios.experiment.engine.gameloop.Game;
import javafx.animation.AnimationTimer;

public class JavaFxGameRenderer extends AnimationTimer {
    private final Game game;
    
    public JavaFxGameRenderer(Game game) {
        this.game = game;
    }
    
    public void resume() {
        this.start();
    }
    
    public void pause() {
        this.stop();
    }
    
    public void handle(long now) {
        var currentScreen = game.getCurrentScreen();
        currentScreen.update(now);
        currentScreen.paint(now);
    }
}
