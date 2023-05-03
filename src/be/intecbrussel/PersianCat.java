package be.intecbrussel;

public class PersianCat extends Felis{
    public void miauw(){

    }

    //Constructor
    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "PersianCat{} "  + super.toString();
    }
}
