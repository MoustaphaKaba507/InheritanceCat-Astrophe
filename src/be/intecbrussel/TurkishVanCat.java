package be.intecbrussel;

public class TurkishVanCat extends Felis{
    public String nickname(){
        return nickname();
    }

    //Constructor
    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }


    @Override
    public String toString() {
        return "TurkishVanCat{} "  + super.toString();
    }
}
