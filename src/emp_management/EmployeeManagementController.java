package emp_management;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeManagementController {
	
	@FXML
	TextField username;
	@FXML
	TextField password;
	@FXML
	TextField email;
	@FXML
	Label lb4;
	
	public void write_on_label() throws IOException {
		  String userText = username.getText();
	        
	        // Vérifier si le texte n'est pas vide
	        if (userText != null && !userText.isEmpty()) {
	            // Mettre à jour le texte du Label
	            lb4.setText(userText);
	        } else {
	            lb4.setText("Username is empty");
	        }
	        Stage primaryStage = new Stage();
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("control_panel.fxml"));
	        Parent root = loader.load();
	        Scene scene = new Scene(root, 800, 600);
	        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

			primaryStage.setTitle("Employee Management");
	        primaryStage.setScene(scene);
	        primaryStage.show();

	}
	

}

