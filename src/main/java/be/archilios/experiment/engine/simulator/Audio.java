package be.archilios.experiment.engine.simulator;

public interface Audio {
    Music createMusic(String file);
    Sound createSound(String file);
}
