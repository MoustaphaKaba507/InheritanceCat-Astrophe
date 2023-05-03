package be.intecbrussel;

public class Animal {
    private char size;
    private char coat;
    private String color;
    private double weight;

    private static int counter;

    {
        counter++;
    }

    //Constructor
    public Animal() {
    }

    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    //Method
    public void makeNoise(String sound){
        System.out.println("meeeooow");

    }

    public void eat(){
        System.out.println("Animal eats");

    }

    public void sleep(){
        System.out.println("Animal Sleeps");

    }
    public boolean isAlive(){
        return true;
    }

    public static int getCounter(){
        return counter;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
