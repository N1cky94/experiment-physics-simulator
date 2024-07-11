package be.archilios.experiment.engine.simulator.javafx;

import be.archilios.experiment.engine.simulator.Simulator;
import javafx.animation.AnimationTimer;

public class JavaFxGameRenderer extends AnimationTimer {
    private final Simulator simulator;
    
    public JavaFxGameRenderer(Simulator simulator) {
        this.simulator = simulator;
    }
    
    public void resume() {
        this.start();
    }
    
    public void pause() {
        this.stop();
    }
    
    public void handle(long now) {
        var currentScreen = simulator.getCurrentScreen();
        currentScreen.update(now);
        currentScreen.paint(now);
    }
}
