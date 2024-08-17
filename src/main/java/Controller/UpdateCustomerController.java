package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Customer;

import javax.swing.*;
import java.io.IOException;

public class UpdateCustomerController {
    Stage stage=new Stage();
    public TextField txtSearchID;
    public Label LaCustomerID;
    public Label LaCustomerTitle;
    public Label LaName;
    public Label LaPhoneNumber;
    private static Customer customer;

    public void btnSearchOnAction(ActionEvent actionEvent) {
        customer=Validation.SearchOnCustomerID(txtSearchID.getText());
        if(customer==null){
            JOptionPane.showMessageDialog(null,"Invalid Contact ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        LaCustomerID.setText(customer.getCustomerID());
        LaCustomerTitle.setText(customer.getCustomerTitle());
        LaName.setText(customer.getName());
        LaPhoneNumber.setText(customer.getPhoneNumber());
    }


    public void btnUpdateNameOnAction(ActionEvent actionEvent) {
        if(LaCustomerID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a Customer ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/UpdateName.fxml"))));
            stage.show();
        } catch (IOException e) {
            System.out.println("Error");
        }



    }

    public void btnUpdateAddressOnAction(ActionEvent actionEvent) {
        if(LaCustomerID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a Customer ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/UpdateAddress.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public void btnUpdatePhoneNumberOnAction(ActionEvent actionEvent) {
        if(LaCustomerID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a Customer ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/UpdatePhoneNumber.fxml"))));
            stage.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        LaCustomerID.setText("");
        LaCustomerTitle.setText("");
        LaName.setText("");
        LaPhoneNumber.setText("");
    }
    public static Customer getCustomer(){
        return customer;
    }
}
