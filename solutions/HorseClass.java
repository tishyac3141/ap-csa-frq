package solutions;

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