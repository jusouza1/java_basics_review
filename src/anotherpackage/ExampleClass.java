package anotherpackage;

import java_basics.MyUtils;

public class ExampleClass {

    public static void doSomething() {
        MyUtils.printSomeJunk(80);
//       if MyUtils is not a public class, then we cant import it because its
//        not visible to another package
    }
}
