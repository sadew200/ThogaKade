package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;

import javax.swing.*;



public class UpdatePhoneNumberController {
    public Label LaCurrentPhoneNumber;
    public TextField txtNewPhoneNumber;
    private Customer customer=UpdateCustomerController.getCustomer();

    public void btnUpdatePhoneNumberOnAction(ActionEvent actionEvent) {
        if(Validation.isPhoneNumberValid(txtNewPhoneNumber.getText())){
            JOptionPane.showMessageDialog(null,"Inavlid Phone Number","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Validation.UpdatePhoneNumber(customer,txtNewPhoneNumber.getText());
        JOptionPane.showMessageDialog(null,"Name has been successfully Updated ","INFORM",JOptionPane.INFORMATION_MESSAGE);
    }
}
