package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    Stage stage=new Stage();

    public void btnAddOnAction(ActionEvent actionEvent){
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/AddCustomer.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/UpdateCustomer.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/DeleteContact.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }


    public void btnSearchOnAction(ActionEvent actionEvent) {
        try {

            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/SearchContact.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public void btnViewOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ViewCustomers.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
