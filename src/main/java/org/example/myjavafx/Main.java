package org.example.myjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML
        Parent root = FXMLLoader.load(getClass().getResource("BMICalculator.fxml"));

        if (root instanceof AnchorPane) {
            AnchorPane anchorPane = (AnchorPane) root;
            anchorPane.setStyle("-fx-background-color: #FDB0C0;");
        }

        // Set the scene
        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
