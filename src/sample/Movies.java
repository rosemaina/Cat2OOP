package sample;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.rmi.Remote;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.application.Application;
import static javafx.application.Application.launch;

public class Movies extends Application implements Remote {

    @Override
    public void start(Stage stage) {
        Text title = new Text("Add Movies");
        Text movieName = new Text("Name");
        Text category = new Text("Category");

        // Initialize text fields
        TextField textfieldA = new TextField();
        TextField textfieldB = new TextField();

        // Initialize buttons
        Button buttonA= new Button("Save");
        Button buttonB = new Button("Delete");

        // Initialize a grid pane
        GridPane gridPaneA = new GridPane();

        gridPaneA.setMinSize(600,600);
        gridPaneA.setPadding(new Insets(15,15,15,15));

        gridPaneA.setVgap(10);
        gridPaneA.setHgap(10);

        gridPaneA.setAlignment(Pos.CENTER);

        gridPaneA.add(title,0,0);

        gridPaneA.add(movieName,0,1);
        gridPaneA.add(textfieldA,1,1);

        gridPaneA.add(category,0,2);
        gridPaneA.add(textfieldB,1,2);

        gridPaneA.add(buttonA,0,3);
        gridPaneA.add(buttonB,1,3);

        buttonA.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 5 20 5 20; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonB.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 5 20 5 20; -fx-text-fill: white; -fx-font-size: 12px;");


        title.setStyle(" -fx-font: normal bold 20px 'serif'");

        movieName.setStyle(" -fx-font: normal bold 20px 'serif'");

        category.setStyle(" -fx-font: normal bold 20px 'serif'");

        gridPaneA.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 2px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
//                "    -fx-background-image: url(image1.jpg);\n" +
                "    -fx-background-insets: 5px;");


        // Initialize a new scene
        Scene sceneA = new Scene(gridPaneA);
        stage.setTitle("NETFLIX MOVIES");
        stage.setScene(sceneA);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void animation(String args []) {
        launch(args);
    }
}
