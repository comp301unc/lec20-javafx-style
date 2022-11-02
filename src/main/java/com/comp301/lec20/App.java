package com.comp301.lec20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage stage) {
    // Set the Stage title
    stage.setTitle("Play 2048!");

    // Create new Pane objects to hold the UI components
    Pane layout = new VBox();
    layout.getStyleClass().add("layout");

    // The scoreboard goes at the top of the board
    Pane scoreboard = new HBox();
    layout.getChildren().add(scoreboard);

    // The scoreboard has a logo
    Pane logoContainer = new HBox();
    Label logo = new Label("2048");
    logoContainer.getChildren().add(logo);
    HBox.setHgrow(logoContainer, Priority.ALWAYS);
    scoreboard.getChildren().add(logoContainer);

    // The scoreboard shows the current score
    Pane score = new VBox();
    Label scoreLabel = new Label("SCORE");
    score.getChildren().add(scoreLabel);
    Label scoreValue = new Label("2268");
    score.getChildren().add(scoreValue);
    scoreboard.getChildren().add(score);

    // The scoreboard also shows the best score
    Pane best = new VBox();
    Label bestLabel = new Label("BEST");
    best.getChildren().add(bestLabel);
    Label bestValue = new Label("2268");
    best.getChildren().add(bestValue);
    scoreboard.getChildren().add(best);


    // Add the instructions to the layout
    Label instructions = new Label("Join the numbers and get to the 2048 tile!");
    layout.getChildren().add(instructions);

    // The game board goes at the bottom of the layout
    GridPane board = new GridPane();
    layout.getChildren().add(board);

    // Fill up the board with tiles
    board.add(makeTile(0), 0, 0);
    board.add(makeTile(2), 1, 0);
    board.add(makeTile(8), 2, 0);
    board.add(makeTile(4), 3, 0);
    board.add(makeTile(16), 0, 1);
    board.add(makeTile(64), 1, 1);
    board.add(makeTile(4), 2, 1);
    board.add(makeTile(2), 3, 1);
    board.add(makeTile(8), 0, 2);
    board.add(makeTile(4), 1, 2);
    board.add(makeTile(32), 2, 2);
    board.add(makeTile(4), 3, 2);
    board.add(makeTile(2), 0, 3);
    board.add(makeTile(256), 1, 3);
    board.add(makeTile(8), 2 ,3);
    board.add(makeTile(2), 3, 3);

    // Set the Scene
    Scene scene = new Scene(layout, 350, 450);
    scene.getStylesheets().add("style/main.css");
    stage.setScene(scene);

    // Show the Stage on the screen
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }

  private static Label makeTile(int num) {
    Label tile;
    if (num == 0) {
      tile = new Label();
    } else {
      tile = new Label(String.valueOf(num));
    }
    return tile;
  }
}

