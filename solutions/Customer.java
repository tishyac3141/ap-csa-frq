package solutions;

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

    public int compareCustomer(Customer other){
        String otherName = other.getName();
        int otherID = other.getID();

        if(name.compareTo(otherName) != 0){
            return name.compareTo(otherName); //check unicode/compareTo documentation
        }
        else{
            return ID - otherID;
        }
    }

    public Customer[] prefixMerge(Customer[] list1, Customer[] list2, Customer[] result){

        Customer c1;
        Customer c2;

        for(int i = 0; i < result.length; i++){
            c1 = list1[i];
            c2 = list2[i];

            if(c1.compareCustomer(c2) <= 0) result[i] = c1;
            else result[i] = c2;
        }

        return result;
    }
}