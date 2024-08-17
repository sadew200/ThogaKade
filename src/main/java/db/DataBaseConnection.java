package db;

import model.Customer;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataBaseConnection {
    private static DataBaseConnection dbc;
    ArrayList<Customer> ar;
    private DataBaseConnection(){
        ar=new ArrayList<Customer>();
    }

    public static DataBaseConnection getInstance(){
        if(dbc==null){
            dbc=new DataBaseConnection();
        }
        return dbc;
    }
    public ArrayList<Customer> getArrayList(){
        return ar;
    }
}
