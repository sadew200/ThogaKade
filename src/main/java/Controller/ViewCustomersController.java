package Controller;

import db.DataBaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class ViewCustomersController {
    public TableView table;
    public TableColumn colCustomerID;
    public TableColumn colCustomerTitle;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colPhoneNumber;
    public TableColumn colDateOfBirth;

    public void btnReloadOnAction(ActionEvent actionEvent) {
        ArrayList<Customer> ar= DataBaseConnection.getInstance().getArrayList();

        colCustomerID.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        colCustomerTitle.setCellValueFactory(new PropertyValueFactory<>("CustomerTitle"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("PhoneNumber"));
        colDateOfBirth.setCellValueFactory(new PropertyValueFactory<>("DateOfBirth"));

        ObservableList<Customer> list= FXCollections.observableArrayList();
        for(Customer c : ar){
            list.add(c);
        }
        table.setItems(list);
    }

}
