package be.intecbrussel;

public class AdeanMoutainCat extends Felis{

    public boolean isAlive(){
        return true;

    }

    //Constructors
    public AdeanMoutainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public void miauw(String customSound){
        System.out.println(customSound);

    }

    @Override
    public String toString() {
        return "AdeanMoutainCat{} "  + super.toString();
    }
}
