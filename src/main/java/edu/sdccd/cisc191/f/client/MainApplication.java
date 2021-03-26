package edu.sdccd.cisc191.f.client;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApplication extends Application {
    public static void main(String[] args) {

        // Just here to test
        Player player = new Warrior(100, 5, 10, 10);
        Enemy ogre = new OgreEnemy(50, 10);

        Map map = new Map();
        map.generateListOfRooms();

        System.out.println(player.getHealth());
        System.out.println(ogre.isDead());

        // JavaFX Launcher
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setTitle("Slay The Spire Clone");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
