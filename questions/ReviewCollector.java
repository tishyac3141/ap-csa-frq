package questions;

import java.util.ArrayList;

/**
 * SUPPLEMENTARY WITH PRODUCTREVIEW
 */

public class ReviewCollector {

    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;
  
    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }
  
    /**
     * Write the addReview method, which adds a single product review, represented by a ProductReview object, 
     * to the ReviewCollector object. The addReview method does the following when it adds a product review:
     * 
     * ProductReview object is added to the 'reviewList'
     * The product name from the product review object is added to 'productList' if the product name isn't 
     * already found
     * 
     * Elements may be added to 'reviewList' in any order
     * 
     */

    public void addReview(ProductReview prodReview) { 
        //your code here
     }

     /**
      * Write the getNumGoodReviews method, which returns the number of good reviews 
      * for a given product name. A review is considered good if it contains the 
      * string "best" (all lowercase). If there are no reviews with a matching product 
      * name, the method returns 0. Note that a review that contains "BEST" or "Best" 
      * is not considered a good review (since not all the letters of "best" are 
      * lowercase), but a review that contains "asbestos" is considered a good review 
      * (since all the letters of "best" are lowercase).
      */
    public int getNumGoodReviews(String prodName) { 
        //your code here
        return 0;
     }
  

}