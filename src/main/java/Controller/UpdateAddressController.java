package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;

import javax.swing.*;

public class UpdateAddressController {
    public Label LaCurrentAddress;
    public TextField txtNewAddress;
    private Customer customer=UpdateCustomerController.getCustomer();

    public void btnUpdateAddressOnAction(ActionEvent actionEvent) {
        Validation.UpdateAddress(customer,txtNewAddress.getText());
        JOptionPane.showMessageDialog(null,"Name has been successfully Updated ","INFORM",JOptionPane.INFORMATION_MESSAGE);
    }
}
