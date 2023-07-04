package OOP;

public class Bird extends Animal {

    public Bird(String species, String name, double weight, double age) {
        super(species, name, weight, age);
        // it's calling the parent class constructor to build the child class object
    }

//    public void fly() {
//        System.out.println("Flying...");
//    }


    @Override
    public void move() {
        System.out.println("moving...");
    }
}
