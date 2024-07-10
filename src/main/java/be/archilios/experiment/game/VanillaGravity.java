package be.archilios.experiment.game;

import be.archilios.experiment.engine.gameloop.Screen;
import be.archilios.experiment.engine.gameloop.javafx.JavaFxGame;

public class VanillaGravity extends JavaFxGame {
    @Override
    public Screen getInitScreen() {
        return new MainScreen(this);
    }
}
