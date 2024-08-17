package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private String CustomerID;
    private String CustomerTitle;
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String DateOfBirth;


}
