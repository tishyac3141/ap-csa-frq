package solutions;

import java.util.ArrayList;

//this class has already been written
//i was just practicing writing it in a time limit of 25 minutes

public class ReviewCollector2 {

    private ArrayList<ProductReview2> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector2(){
        reviewList = new ArrayList<ProductReview2>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview2 prodReview){

        reviewList.add(prodReview);

        boolean isThere = false;
        String name = prodReview.getName();
        String otherName;

        for(int i = 0; i < productList.size(); i++){
            otherName = productList.get(i);
            if(otherName.equals(name)) isThere = true;
        }
        if(!isThere) productList.add(name);

    }

    public int getNumGoodReviews(String prodName){
        int amtOfReviews = 0;
        String review;
        for(int i = 0; i < reviewList.size(); i++){
            
            if(reviewList.get(i).getName().equals(prodName)){
                review = reviewList.get(i).getReview();
                if(review.indexOf("best") > 0) amtOfReviews++;
            }
        }

        return amtOfReviews;
    }
    
}