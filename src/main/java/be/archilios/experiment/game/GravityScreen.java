package be.archilios.experiment.game;

import be.archilios.experiment.engine.gameloop.ARGBColor;
import be.archilios.experiment.engine.gameloop.Game;
import be.archilios.experiment.engine.gameloop.Graphics;
import be.archilios.experiment.engine.gameloop.Screen;
import be.archilios.experiment.engine.physics.Coordinate2D;
import be.archilios.experiment.engine.physics.Forces;
import be.archilios.experiment.engine.physics.Vector2D;
import javafx.scene.input.KeyCode;

public class GravityScreen extends Screen {
    public static final Vector2D GRAVITY = new Vector2D(0 , 0.2f);
    public static final Vector2D WIND = new Vector2D(0.015f, 0);
    private final Floor floor;
    private Cube cube;
    
    public GravityScreen(Game game) {
        super(game);
        Graphics graphics = game.getGraphics();
        resetCube();
        floor = new Floor(new Coordinate2D(0, graphics.getHeight() - 20), graphics.getWidth());
    }
    
    private void resetCube() {
        System.out.println("Resetting Cube");
        this.cube = new Cube(new Coordinate2D(500, 0), 0.1f);
    }
    
    @Override
    public void update(float deltaTime) {
        enactForcesOnItem();
        
        cube.update();
    }
    
    private void enactForcesOnItem() {
        if (game.getInput().isKeyPressed(KeyCode.SPACE)) {
            resetCube();
            return;
        }
        
        if (cube.collidesWith(floor)) {
            cube.setVelocity(Vector2D.zeroVector());
        } else {
            cube.applyForce(Forces.gravity(cube));
            cube.applyForce(WIND);
        }
    }
    
    @Override
    public void paint(float deltaTime) {
        game.getGraphics().clearScreen(ARGBColor.WHITE);
        
        floor.draw(game.getGraphics());
        cube.draw(game.getGraphics());
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
