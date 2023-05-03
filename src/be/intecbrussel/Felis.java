package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal{

    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    private static int  NoOfVaccinations=0;
    {
        NoOfVaccinations++;
    }



    //Constructors
 public Felis(String name, int age, int shelterNo, int badgeNo) {
  this.name = name;
  this.age = age;
  this.shelterNo = shelterNo;
  this.badgeNo = badgeNo;
 }

 //getters and setters
    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }

    //method
    public void miauw(){
        System.out.println("Felis miauw");
    }
    public void miauw(int times){

    }

    public static int getNoOfVaccinations(){
        return NoOfVaccinations;
    }


 @Override
 public String toString() {
  return "Felis{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", shelterNo=" + shelterNo +
          ", badgeNo=" + badgeNo +
          '}';
 }
}
