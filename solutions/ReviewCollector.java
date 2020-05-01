package solutions;

import java.util.ArrayList;

public class ReviewCollector {

    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;
  
    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }
  
    //for test purposes only
    public ReviewCollector(ArrayList<ProductReview> list) {
        reviewList = list;
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) { 
        String name = prodReview.getName();
        boolean isThere = false;

        reviewList.add(prodReview);

        for(int i = 0; i < productList.size(); i++){
            if(productList.get(i).equals(name)) isThere = true;
        }

        if(!isThere) productList.add(name);
     }
  
    public int getNumGoodReviews(String prodName) { 
    
        String review = "";
        int numOfGoodReviews = 0;

        for(int i = 0; i < reviewList.size(); i++){
            if(reviewList.get(i).getName().equals(prodName)){
                
                review = reviewList.get(i).getReview();
                if(review.indexOf("best") >= 0) numOfGoodReviews++;
            }
        
        }

        return numOfGoodReviews;
     }
}