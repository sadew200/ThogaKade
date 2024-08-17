package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;

import javax.swing.*;

public class DeleteContactController {
    public TextField txtSearchID;
    public Label LaPhoneNumber;
    public Label LaCustomerID;
    public Label LaCustomerTitle;
    public Label LaName;
    private  Customer customer;

    public void btnSearchOnAction(ActionEvent actionEvent) {
        customer= Validation.SearchOnCustomerID(txtSearchID.getText());
        if(customer==null){
            JOptionPane.showMessageDialog(null,"Invalid Contact ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        LaCustomerID.setText(customer.getCustomerID());
        LaCustomerTitle.setText(customer.getCustomerTitle());
        LaName.setText(customer.getName());
        LaPhoneNumber.setText(customer.getPhoneNumber());
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        if(LaCustomerID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a Customer ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Validation.Delete(customer);
        JOptionPane.showMessageDialog(null,"Customer has been successfully Deleted ","INFORM",JOptionPane.INFORMATION_MESSAGE);
    }
}




