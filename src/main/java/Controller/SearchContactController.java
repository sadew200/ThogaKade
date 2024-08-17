package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;

import javax.swing.*;

public class SearchContactController {
    public TextField txtSearchID;
    public Label LaCustomerID;
    public Label LaCustomerTitle;
    public Label LaName;
    public Label LaPhoneNumber;
    public Label LaAddress;
    public Label LaDateOfBirth;


    public void btnSearchOnAction(ActionEvent actionEvent) {
        Customer customer= Validation.SearchOnCustomerID(txtSearchID.getText());
       if(customer==null){
           JOptionPane.showMessageDialog(null,"Invalid Contact ID","Error",JOptionPane.ERROR_MESSAGE);
           return;
       }
        LaCustomerID.setText(customer.getCustomerID());
        LaCustomerTitle.setText(customer.getCustomerTitle());
        LaName.setText(customer.getName());
        LaAddress.setText(customer.getAddress());
        LaPhoneNumber.setText(customer.getPhoneNumber());
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        LaCustomerID.setText("");
        LaCustomerTitle.setText("");
        LaName.setText("");
        LaAddress.setText("");
        LaPhoneNumber.setText("");
    }

    public void btnBackOnAction(ActionEvent actionEvent) {
    }

}
