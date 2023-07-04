package OOP;

public class Fish extends Animal{

    public Fish(String species, String name, double weight, double age) {
        super(species, name, weight, age);
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public void move() {
        System.out.println("moving...");
    }
}
