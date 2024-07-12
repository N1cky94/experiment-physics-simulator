package be.archilios.experiment.simulations;

import be.archilios.experiment.engine.simulator.Screen;
import be.archilios.experiment.engine.simulator.javafx.JavaFxSimulator;

public class VanillaGravity extends JavaFxSimulator {
    @Override
    public Screen getInitScreen() {
        return new BouncingBallScreen(this);
    }
}
