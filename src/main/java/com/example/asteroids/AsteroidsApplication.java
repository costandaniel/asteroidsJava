package com.example.asteroids;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(600, 400);
        Polygon parallelogram = new Polygon(0, 0, 100, 0, 100, 50, 0, 50);
        parallelogram.setTranslateX(100);
        parallelogram.setTranslateY(20);
        pane.getChildren().add(parallelogram);

        Scene scene = new Scene(pane);
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}