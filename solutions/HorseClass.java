package solutions;

/**
 * CREATED FOR TEST PURPOSES ONLY (so you can run your code)
 * SUPPLEMENTARY TO HORSEBARN and HORSE (interface)
 */

public class HorseClass implements Horse{

    private String name;
    private int weight;

    public HorseClass(int weight, String name){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }



}