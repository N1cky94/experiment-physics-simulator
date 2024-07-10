package be.archilios.experiment.engine.gameloop;

public interface Audio {
    Music createMusic(String file);
    Sound createSound(String file);
}
