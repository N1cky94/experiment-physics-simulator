package be.archilios.experiment.simulations;

import be.archilios.experiment.engine.physics.Forces;
import be.archilios.experiment.engine.physics.twodimensional.Coordinate2D;
import be.archilios.experiment.engine.simulator.ARGBColor;
import be.archilios.experiment.engine.simulator.Graphics;
import be.archilios.experiment.engine.simulator.Screen;
import be.archilios.experiment.engine.simulator.Simulator;
import be.archilios.experiment.simulations.bodies.*;
import javafx.scene.input.KeyCode;

public class BouncingBallScreen extends Screen {
    private final Floor floor;
    private Ball ball;
    private boolean running;
    
    public BouncingBallScreen(Simulator simulator) {
        super(simulator);
        Graphics graphics = simulator.getGraphics();
        resetBall();
        floor = new Floor(new Coordinate2D(0, graphics.getHeight() - 20), graphics.getWidth());
    }
    
    private void resetBall() {
        System.out.println("Ball has been reset");
        this.ball = new Ball(new Coordinate2D(500, 0));
    }
    
    @Override
    public void update(float deltaTime) {
        checkForKeyPresses();
        
        if (isRunning()) {
            enactForces();
            
            ball.update();
        }
    }
    
    // todo: might move this to a key controls analyzer
    private void checkForKeyPresses() {
        if (isKeyPressed(KeyCode.R)) {
            toggleRunning();
        } else if (isKeyPressed(KeyCode.SPACE)) {
            toggleFreeze();
        } else if (isKeyPressed(KeyCode.F)) {
            toggleFreeze();
            removeForces();
        } else if(isKeyPressed(KeyCode.Q)) {
            toggleFreeze();
            resetBall();
        }
    }
    
    private boolean isKeyPressed(KeyCode code) {
        return simulator.getInput().isKeyPressed(code);
    }
    
    private void toggleRunning() {
        this.running = true;
    }
    
    private void toggleFreeze() {
        this.running = false;
    }
    
    public boolean isRunning() {
        return running;
    }
    
    private void enactForces() {
        if (ball.collidesWith(floor)) {
            removeForces();
        } else {
            ball.applyForce(Forces.gravity(ball));
        }
    }
    
    private void removeForces() {
        ball.stopMovement();
    }
    
    @Override
    public void paint(float deltaTime) {
        simulator.getGraphics().clearScreen(ARGBColor.WHITE);
        
        floor.draw(simulator.getGraphics());
        ball.draw(simulator.getGraphics());
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
