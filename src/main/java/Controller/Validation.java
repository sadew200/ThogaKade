package Controller;

import db.DataBaseConnection;
import model.Customer;

import java.util.ArrayList;

public class Validation {
    private static ArrayList<Customer> ar= DataBaseConnection.getInstance().getArrayList();
   public static boolean isDuplicateCustomerID(String CustomerID){

       for(Customer c : ar){
           if(c.getCustomerID().equals(CustomerID)){
               return true;
           }
       }
       return false;
   }
   public static boolean isPhoneNumberValid(String PhoneNumber){
       return PhoneNumber.length()!=10 || PhoneNumber.charAt(0)!='0';
   }
   public static boolean isDateOfBirthValid(String DateOfBirth){
       return DateOfBirth.length()!=10 || (Integer.parseInt(DateOfBirth.substring(0,4))>=2024 || Integer.parseInt(DateOfBirth.substring(5,7))>12 || Integer.parseInt(DateOfBirth.substring(8,10))>30);
   }
   public static boolean isCustomerTitleValid(String CustomerTitle){
       return !CustomerTitle.toLowerCase().equals("mr") && !CustomerTitle.toLowerCase().equals("miss");
   }

    public static Customer SearchOnCustomerID(String CustomerID) {
       for(Customer c : ar){
           if(c.getCustomerID().equals(CustomerID)){
               System.out.println(c.getCustomerID().equals(CustomerID));
               return c;
           }
       }
       return null;
    }

    public static void UpdateName(Customer c,String NewName){
       int index=ar.indexOf(c);
       Customer customer=new Customer(c.getCustomerID(),c.getCustomerTitle(),NewName,c.getAddress(),c.getPhoneNumber(),c.getDateOfBirth());
       ar.remove(c);
       ar.add(index,customer);
    }

    public static void UpdatePhoneNumber(Customer c,String NewPhoneNumber){
        int index=ar.indexOf(c);
        Customer customer=new Customer(c.getCustomerID(),c.getCustomerTitle(),c.getName(),c.getAddress(),NewPhoneNumber,c.getDateOfBirth());
        ar.remove(c);
        ar.add(index,customer);
    }
    public static void UpdateAddress(Customer c,String NewAddress){
        int index=ar.indexOf(c);
        Customer customer=new Customer(c.getCustomerID(),c.getCustomerTitle(),c.getName(),NewAddress,c.getPhoneNumber(),c.getDateOfBirth());
        ar.remove(c);
        ar.add(index,customer);
    }
    public static void Delete(Customer c){
       ar.remove(c);
    }
}
