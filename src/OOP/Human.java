package OOP;

// classes contain instructions to how objects can be created
public class Human {

    String name;
    int age;
    double height;
    String eyecColor;

    public Human(String name, int age, double height, String eyecColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyecColor = eyecColor;
        // this = particular object/instance
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + height + " meter(s) tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyecColor);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }


}
