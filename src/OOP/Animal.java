package OOP;

// abstract classes are only meant to be extended, they cannot be instantiated
public abstract class Animal {

    String species;

    String name;

    double weight;

    double age;

    public Animal(String species, String name, double weight, double age) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void information() {
        System.out.println("Species: "+ this.species + "\n" + "Name: " + this.name + "\n"
        + "Wight " + this.weight + "\n" + "Age: " + this.age + "\n");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public abstract void move();
}
