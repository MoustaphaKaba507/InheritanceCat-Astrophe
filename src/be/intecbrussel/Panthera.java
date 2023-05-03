package be.intecbrussel;

public class Panthera extends Animal{

    public String roar(){
      return roar();
    }

    public void hunt(){
        System.out.println("Panthers hunt");
    }

    @Override
    public String toString() {
        return "Panthera{}";
    }
}
