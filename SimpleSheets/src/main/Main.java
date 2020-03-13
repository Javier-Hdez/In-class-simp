package main.java.classes;
//imports
import main.java.classes.Address;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
      
        ArrayList<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address(1, "123 Main St", "", "The Dalles", "OR", 97058));
        addresses.add(new Address(2, "456 Main St", "", "The Dalles", "OR", 97058));
        
        for(Address a : addresses){
            if(a.getAddressID() == 2){
                System.out.println(a.printAddress());
            }
        }
        
        
        
    }
}