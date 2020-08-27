package Asteroids;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Asteroids extends Application {
    private Pane root;
    private List<GameObject> bullets = new ArrayList<>();
    private List<GameObject> enemies = new ArrayList<>();
    private GameObject players;

    private Parent createContent() {
        root = new Pane();

        root.setPrefSize(600, 600);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                onUpdate();
            }
        };
        timer.start();
        return root;
    }

    private void onUpdate() {

    }


    @Override
    public void start(Stage stage) throws Exception {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
