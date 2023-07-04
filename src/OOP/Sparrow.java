package OOP;

// a class can only extend one class
public class Sparrow extends Animal implements Flyable{

    public Sparrow(String species, String name, double weight, double age) {
        super(species, name, weight, age);
    }

    @Override
    public void fly() {
        System.out.println("Not able to fly");
    }

    @Override
    public void move() {
        System.out.println("moving...");
    }

    // interface is a contract, any class that implements that interface should implement its methods
}
