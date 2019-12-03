//package sample;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Movies extends Application {

    @Override
    public void start(Stage stage) {
        Text genre = new Text("Genres");
        Text movieName = new Text("Name");
        Text category = new Text("Category");

        ComboBox comboBoxA = new ComboBox();
        ComboBox comboBoxB = new ComboBox();

        TextField textfieldA = new TextField();

        Button buttonA= new Button("Save");
        Button buttonB = new Button("Delete");


        GridPane gridPaneA = new GridPane();

        gridPaneA.setMinSize(600,600);

        gridPaneA.setPadding(new Insets(15,15,15,15));

        gridPaneA.setVgap(10);
        gridPaneA.setHgap(10);

        gridPaneA.setAlignment(Pos.CENTER);

        gridPaneA.add(genre,0,0);
//        gridPaneA.add(comboBoxA,1,0);



        gridPaneA.add(movieName,0,2);
        gridPaneA.add(textfieldA,1,2);
        gridPaneA.add(buttonA,1,3);

        gridPaneA.add(category,0,4);//column row
//        gridPaneA.add(comboBoxB,1,4);;
        gridPaneA.add(buttonB,1,5);

        buttonA.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonB.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");

        genre.setStyle(" -fx-font: normal bold 20px 'serif'");
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
