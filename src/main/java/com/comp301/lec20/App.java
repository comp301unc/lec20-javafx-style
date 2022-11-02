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

    // The scoreboard goes at the top of the board
    Pane scoreboard = new HBox();
    layout.getChildren().add(scoreboard);

    // Add the instructions to the layout
    Label instructions = new Label("Join the numbers and get to the 2048 tile!");
    layout.getChildren().add(instructions);

    // The game board goes at the bottom of the layout
    GridPane board = new GridPane();
    layout.getChildren().add(board);

    // Set the Scene
    Scene scene = new Scene(layout, 350, 450);
    stage.setScene(scene);

    // Show the Stage on the screen
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
