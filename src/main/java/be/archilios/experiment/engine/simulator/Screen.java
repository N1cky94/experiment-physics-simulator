package be.archilios.experiment.engine.simulator;

public abstract class Screen {
    protected final Simulator simulator;
    
    public Screen(Simulator simulator) {
        this.simulator = simulator;
    }
    
    public abstract void update(float deltaTime);
    public abstract void paint(float deltaTime);
    public abstract void pause();
    public abstract void resume();
    public abstract void dispose();
    public abstract void backButton();
}
