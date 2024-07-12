package be.archilios.experiment.simulations;

import be.archilios.experiment.engine.simulator.ARGBColor;
import be.archilios.experiment.engine.simulator.Simulator;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.Screen;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;
import be.archilios.experiment.engine.physics.Forces;
import be.archilios.experiment.engine.physics.twodimensional.Vector2D;
import javafx.scene.input.KeyCode;

public class GravityScreen extends Screen {
    public static final Vector2D WIND = new Vector2D(0.15, 0);
    private final Floor floor;
    private Cube cube;
    
    public GravityScreen(Simulator simulator) {
        super(simulator);
        Graphics graphics = simulator.getGraphics();
        resetCube();
        floor = new Floor(new Coordinate2D(0, graphics.getHeight() - 20), graphics.getWidth());
    }
    
    private void resetCube() {
        System.out.println("Resetting Cube");
        this.cube = new Cube(new Coordinate2D(500, 0), 1);
    }
    
    @Override
    public void update(float deltaTime) {
        enactForcesOnItem();
        
        cube.update();
    }
    
    private void enactForcesOnItem() {
        if (simulator.getInput().isKeyPressed(KeyCode.SPACE)) {
            resetCube();
            return;
        }
        
        if (cube.collidesWith(floor)) {
            cube.stopMovement();
        } else {
            cube.applyForce(Forces.gravity(cube));
            cube.applyForce(Forces.wind(cube));
        }
    }
    
    @Override
    public void paint(float deltaTime) {
        simulator.getGraphics().clearScreen(ARGBColor.WHITE);
        
        floor.draw(simulator.getGraphics());
        cube.draw(simulator.getGraphics());
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
