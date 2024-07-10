package be.archilios.experiment.engine.gameloop;

public interface Game {
    Audio getAudio();
    Input getInput();
    FileIO getFileIO();
    Graphics getGraphics();
    void setScreen();
    Screen getCurrentScreen();
    Screen getInitScreen();
}
