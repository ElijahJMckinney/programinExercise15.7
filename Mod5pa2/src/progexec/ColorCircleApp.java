package progexec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorCircleApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle with an initial color of white
        Circle circle = new Circle(100, Color.WHITE);

        // Event handler for mouse pressed (change color to black)
        circle.setOnMousePressed((MouseEvent event) -> {
            circle.setFill(Color.BLACK); // Change color to black when pressed
        });

        // Event handler for mouse released (change color to white)
        circle.setOnMouseReleased((MouseEvent event) -> {
            circle.setFill(Color.WHITE); // Change color to white when released
        });

        // Set up the layout
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        // Set the scene with the root layout
        Scene scene = new Scene(root, 300, 300);

        // Set the title of the window
        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
