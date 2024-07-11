package be.archilios.experiment.engine.simulator;

public interface Simulator {
    Audio getAudio();
    Input getInput();
    FileIO getFileIO();
    Graphics getGraphics();
    void setScreen(Screen screen);
    Screen getCurrentScreen();
    Screen getInitScreen();
}
