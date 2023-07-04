package java_basics;

public class LearningArrays {

    public static void main(String[] args) {

        double[] values = new double[100];
        // declaring a variable of integer array
        // multiple elements, in this example, initialized with 100 slots
        values[0] = 1000;
        values[1] = 55.6;
        values[99] = 129832;

        System.out.println(values[99]);

        String [] words = new String[] {"My", "name", "is"};

        System.out.println(words[2]);

        words = new String[10];

        System.out.println(words[1]);

    }
}
