package questions;

/**
 * SUPPLEMENTARY WITH REVIEWCOLLECTOR; SEE IT FOR FULL QUESTION
 */

public class ProductReview {

    private String name;
    private String review;

    public ProductReview(String pName, String pReview){
        name = pName;
        review = pReview;
    }

    public String getName(){
        return name;
    }

    public String getReview(){
        return review;
    }

}