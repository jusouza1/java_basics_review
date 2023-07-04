package OOP;

public class Chicken extends Bird{

    public Chicken(String species, String name, double weight, double age) {
        super(species, name, weight, age);
    }

    // overriding the method defined in Bird, because chickens cant fly
    // replacing an inherited method
//    public void fly(){
//        System.out.println("not able to fly...");
//    }
}
