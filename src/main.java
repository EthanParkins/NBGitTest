
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;





public class main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}

/*
this is a test number two


reeee
*/


