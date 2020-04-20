package questions;

/**
 * STAND ALONE QUESTION
 */

public class Customer {

    String name;
    int ID;

    public Customer(String name, int idNum){
        this.name = name;
        this.ID = idNum;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }


    /**
     * Write the Customer method compareCustomer, which compares this customer to a given customer, other. 
     * Customers are ordered alphabetically by name, using the compareTo method of the String class. 
     * If the names of the two customers are the same, then the customers are ordered by ID number. 
     * Method compareCustomer should return a positive integer if this customer is greater than other, 
     * a negative integer if this customer is less than other, and 0 if they are the same.
     * 
     * For example, suppose we have the following 'Customer' objects declared:
     * Customer c1 = new Customer("Smith", 1001);
     * Customer c2 = new Customer("Anderson", 1002);
     * Customer c3 = new Customer("Smith", 1003);
     * 
     * Hence:
     * 
     * c1.compareCustomer(c1) should return 0
     * c1.compareCustomer(c2) should return a postive integer
     * c1.compareCustomer(c3) should return a negative integer
     * 
     */
    public int compareCustomer(Customer other){
        //your code here
        return 0;
    }


    public static Customer[] prefixMerge(Customer[] list1, Customer[] list2, Customer[] result){
        //your code here
        return result;
    }
}