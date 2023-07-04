package java_basics;

public class MyUtils {

    public static String printSomeJunk(String argument) {
        return argument;
    }

    public static int printSomeJunk(int argument) {
        return argument;
    }
    // two methods with the same name but different signatures
    // the static method belongs to the class and can be invoked directly by the class

    public static int sum2Numbers(int firstArg, int secondArg) {
        return firstArg + secondArg;
    }

    public int add10(int someArg){
        return someArg+10;
    }
    // if the method isn't static, we won't be able to access it directly through the class
    // when theres no 'static' it belongs to the instance of the class, not the class itself
}
