package OOP;

public class Zoo {

    public static void main(String[] args) {
        // objects only exist during runtime

        Bird bird1 = new Bird("Bird", "Louro Jose", 1, 3);
        bird1.eat();
        bird1.sleep();
//        bird1.fly();

        Chicken chicken1 = new Chicken("Bird", "Galinha pintadinha", 2, 4);
//        chicken1.fly();

        Sparrow sparrow = new Sparrow("Bird", "ze carioca", 1, 10);
        sparrow.move();

        Animal sparrow1 = new Sparrow("Bird", "ze carioca", 1, 10);
        sparrow1.move();

        Animal fish1 = new Fish("Fish", "Nemo", 0.3, 1);
        fish1.move();

        moveAnimals(fish1);
        moveAnimals(sparrow1);

        Flyable flyable = new Sparrow("Bird", "Chico", 0.7, 4);
        flyable.fly();
        // can only access the method defined on the interface
        // Sparrow is flyable, because it implements the method fly()
    }

    public static void moveAnimals(Animal animal) {
        animal.move();
        //works for any kind of animal
        // polymorhphism -> any class that has Animal as its parent should be able to move on its own particular way
    }



}
