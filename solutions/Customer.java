package solutions;

/**
 * work in progress; does not work
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

    public static Customer[] prefixMerge(Customer[] list1, Customer[] list2, Customer[] result){

        Customer c1;
        Customer c2;
        int counter = 0;

        for(int i = 0; i < result.length; i++){
            c1 = list1[i];
            c2 = list2[i];

            if(counter < result.length){
                
                if(c1.compareCustomer(c2) == 0){
                    if(counter > 0 && result[counter - 1].compareCustomer(result[counter]) != 0){
                        result[counter] = c1;
                        counter++;
                    }
                }
                else if(c1.compareCustomer(c2) < 0){ 
                    if(counter > 0 && result[counter - 1].compareCustomer(c1) != 0){
                        result[counter] = c1;
                        result[counter + 1] = c2;
                        counter += 2;
                    }
                    else if(counter > 0 && result[counter - 1].compareCustomer(c2) != 0){
                        result[counter] = c2;
                        counter++;
                    }
                }
            
                else {
                    if(counter > 0 && result[counter - 1].compareCustomer(c2) != 0){
                        result[counter] = c2;
                        result[counter + 1] = c1;
                        counter += 2;
                    }
                    else if(counter > 0 && result[counter - 1].compareCustomer(c1) != 0){
                        result[counter] = c1;
                        counter++;
                    }
                }
            }
            else{
                System.out.println("i at break = " + i);
                break;
            }
    }

        return result;
    }
}