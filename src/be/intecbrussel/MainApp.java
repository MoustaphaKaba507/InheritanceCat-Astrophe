package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Panthera pan = new Panthera();
        Acinonyx acinonyx = new Acinonyx();


        Felis felis[] = new Felis[6];

        felis[0]= new SiameseCat("Siamese",11,26,002);
        felis[1]=new PersianCat("Persian",13,40,005);
        felis[2]=new TurkishVanCat("TurkishVan",25,10,006);
        felis[3]=new NorwegianForestCat("Norwegian",13,30,003);
        felis[4]=new AdeanMoutainCat("Adean",14,11,110);
        felis[5]=new Felis("felix",11,21,001);

        for (Felis felix : felis) {
            System.out.println(felix);

        }
        Felis felis1 = new Felis();
        Felis felis2= new Felis();

        System.out.println(felis1 == felis2);
        System.out.println(felis1.equals(felis2));




    }
}
