package be.archilios.experiment.simulations;

import be.archilios.experiment.engine.simulator.Simulator;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.Screen;

public class MainScreen extends Screen {
    
    public MainScreen(Simulator simulator) {
        super(simulator);
        Graphics graphics = simulator.getGraphics();
    }
    
    @Override
    public void update(float deltaTime) {
    
    }
    
    @Override
    public void paint(float deltaTime) {
    
    }
    
    @Override
    public void pause() {
    
    }
    
    @Override
    public void resume() {
    
    }
    
    @Override
    public void dispose() {
    
    }
    
    @Override
    public void backButton() {
    
    }
}
