package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;


import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class UpdateNameController  {
    public Label LaCurrentName;
    public TextField txtNewName;
    private Customer customer=UpdateCustomerController.getCustomer();





    public void btnUpdateNameOnAction(ActionEvent actionEvent) {
        Validation.UpdateName(customer,txtNewName.getText());
        JOptionPane.showMessageDialog(null,"Name has been successfully Updated ","INFORM",JOptionPane.INFORMATION_MESSAGE);

    }


}
