/**
 * <h1> Movies </h1>
 * This is the UI class of the program
 * @author George Kimani
 * @author Sankan Nabuyani
 * @author Rose Maina
 * @version v1.0
 */

package sample;
import java.sql.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.application.Application;

public class BucketList extends Application implements Interface {

    // Public Instance Variables
    String DB_NAME = "jdbc:mysql://localhost:3306/buckets";
    String USERNAME = "root";
    String PASSWORD = "";

    /**
     * Builds the Scene
     *@param stage To set the scene
     *@return void None(does not return anything)
     */

    @Override
    public void start(Stage stage) throws Exception {

//         Establish the DB connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_NAME, USERNAME, PASSWORD);

        } catch(ClassNotFoundException e ) {
            System.out.println(e);
            System.exit(1);
        }

        Text title = new Text("Fill in your bucketlist!");
        Text bucketListName = new Text("Name");
        Text bucketListItem = new Text("Activity");

        // Initialize text fields
        TextField textfieldA = new TextField();
        TextField textfieldB = new TextField();

        // Initialize buttons
        Button buttonA= new Button("Save");
        Button buttonB = new Button("Delete");

        // Initialize a grid pane
        GridPane gridPane = new GridPane();

        // Set look and feel of the app
        gridPane.setMinSize(600,600);
        gridPane.setPadding(new Insets(15,15,15,15));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(title,0,0);

        gridPane.add(bucketListName,0,1);
        gridPane.add(textfieldA,1,1);

        gridPane.add(bucketListItem,0,2);
        gridPane.add(textfieldB,1,2);

        gridPane.add(buttonA,0,3);
        gridPane.add(buttonB,1,3);

        buttonA.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 5 20 5 20; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonB.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 5 20 5 20; -fx-text-fill: white; -fx-font-size: 12px;");


        title.setStyle(" -fx-font: normal bold 20px 'serif'");

        bucketListName.setStyle(" -fx-font: normal bold 20px 'serif'");

        bucketListItem.setStyle(" -fx-font: normal bold 20px 'serif'");

        gridPane.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 2px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(bucket_list_logo.png);\n" + //not showing image(not sure why)
                "    -fx-background-insets: 5px;");


        // Create a new scene object
        Scene scene = new Scene(gridPane);

        // Set a title to the stage
        stage.setTitle("BucketListy");

        // Append a scene to the stage
        stage.setScene(scene);

        // Display the contents of the stage
        stage.show();


        // Write the code to insert
    }

    /**
     * Functions runs the UI
     *@return void None(does not return anything)
     */
    @Override
    public void animation() {
        launch();
    }
}
