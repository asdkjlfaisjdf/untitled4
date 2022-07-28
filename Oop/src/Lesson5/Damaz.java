package Lesson5;

public class Damaz extends Car implements Metal,Mato,Rezina,Plastic {

    public static Object show;
    public static Object c;

    public Damaz(String name, String brand, int price) {
        super(name, brand, price);
    }



    @Override
    public void chexol() {
        System.out.println("chexol");
    }

    @Override
    public void rama() {
        System.out.println("rama");
    }

    @Override
    public void fara() {
        System.out.println("fara");
    }

    @Override
    public void shina() {
        System.out.println("shina");
    }
}
