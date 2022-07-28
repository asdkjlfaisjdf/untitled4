package Lesson5;

abstract class Car {
    String name;
    String brand;
    int price;



    public Car(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;






    }
    public void show(){
        System.out.println(name);
        System.out.println(brand);
        System.out.println(price);
    }

}

