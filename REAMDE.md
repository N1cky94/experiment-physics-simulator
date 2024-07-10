# Experiment: Simple Gaming Engine

> 
> During a talk of Tom Cools (Learning through tinkering), I wanted to test the building of a little
> game that acts with gravity. Being a physics nerd, this interested me immediately. So enjoy my code and learning progress.
> 
> Created: Nick Bauters

## Game Engine

The game engine I rebuild with the guidance of Tom's code can be found in the package gameEngine.
This is based on a blog post, that unfortunately has been lost in time.

The `engine` contains the framework to make the games work.
- `gameloop` contains the basic interfaces to work with and the JavaFX implementation we are using to create the game UI
- `physics` contains all the basic interfaces and custom implementations to make physics work in the game engine

## Installing and running the game

### With Maven

Open the project and run the following command:
```shell
mvn clean javafx::run
```

This will compile and package the code and use the maven plugin provided in the POM to run the code as a JavaFX application.
The application will open in full screen and show the current build UI.

To stop the run, you simple pres `ctrl + c` in the terminal to terminate the process.

## Development of the game

## Sources

- Original Talk: [Learning Through Tinkering by Tom Cools on Jfokus](https://www.youtube.com/watch?v=Ida-awHnrPY)
- The original enigine from Tom: [Tom Cools Java FX Game Experiments](https://github.com/TomCools/JavaFXGameExperiments)