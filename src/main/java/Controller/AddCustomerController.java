package Controller;

import db.DataBaseConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import javax.swing.*;
import java.util.ArrayList;

public class AddCustomerController {
    public TextField txtCustomerID;
    public TextField txtCustomerTitle;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtPhoneNumber;
    public TextField txtBirthDay;

    public void btnAddOnAction(ActionEvent actionEvent) {
        ArrayList<Customer> ar= DataBaseConnection.getInstance().getArrayList();
        if(Validation.isDuplicateCustomerID(txtCustomerID.getText())) {
            JOptionPane.showMessageDialog(null, "This Customer ID has been already used", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(Validation.isCustomerTitleValid(txtCustomerTitle.getText())){
            JOptionPane.showMessageDialog(null,"Invalid Customer Title(Mr/Miss)","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(Validation.isPhoneNumberValid(txtPhoneNumber.getText())){
            JOptionPane.showMessageDialog(null,"Inavlid Phone Number","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(Validation.isDateOfBirthValid(txtBirthDay.getText())){
            JOptionPane.showMessageDialog(null,"Invalid Date Of Birth","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        ar.add(new Customer(txtCustomerID.getText(),txtCustomerTitle.getText(),txtName.getText(),txtAddress.getText(),txtPhoneNumber.getText(),txtBirthDay.getText()));
        JOptionPane.showMessageDialog(null,"Customer has been successfully Saved ","INFORM",JOptionPane.INFORMATION_MESSAGE);

    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        txtCustomerID.setText("");
        txtCustomerTitle.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtBirthDay.setText("");
    }

    public void btnBackOnAction(ActionEvent actionEvent) {
    }
}
