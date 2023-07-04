package OOP;

public class Eatrh {


    public static void main(String[] args) {

        Human human = new Human("Tom", 18, 1.8, "brown");
        Human human1 = new Human("Ana", 15, 1.6, "green");
        Human human3 = new Human("Lucas", 30, 1.7, "brown");

        human1.speak();
        human.speak();
        human3.speak();
    }
}
