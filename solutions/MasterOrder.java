package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * SUPPLEMENTARY WITH COOKIEORDER.JAVA
 */

public class MasterOrder {

    public List<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }

    public MasterOrder(ArrayList<CookieOrder> list){
        orders = list;
    }

    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }

    public int getTotalBoxes(){
        if(orders.size() == 0) return 0;

        int sum = 0;
        for(int i = 0; i < orders.size(); i++){
            sum += orders.get(i).getNumBoxes();
        }

        return sum;
    }

    public int removeVariety(String cookieVar){
        int sum = 0;
        CookieOrder cookie;

        for(int i = 0; i < orders.size(); i++){
            cookie = orders.get(i);
            if(cookie.getVariety().equals(cookieVar)){
                sum += cookie.getNumBoxes();
                orders.remove(i);
                i--;
            }
        }

        return sum;
    }
    
}