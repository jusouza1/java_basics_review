package practiceStrings;

public class StringsPractice {
// String is backed up by a class definition

    public static void main(String[] args) {

        String a = "hello   ";

        String str = "ABCDEFG";

        System.out.println(str.substring(3));
        // it will show the characters from index 3

        System.out.println(a.length());

        String b = "there";


        if (a.equals("hello")) {
            // best way to compare strings
        }

        if(b.equalsIgnoreCase("There")){
            System.out.println("Printed there");
            // it will ignore the fact that there is in capital letter and it will print the message
        }

        System.out.println(a.charAt(3));
        // returns a value of type char

        String test = "Hello there yogi there";

        int index = test.indexOf("there");
        System.out.println(index);
        // index where the word there begins

        int index2 = test.indexOf("there", 7);

        int index3 = test.lastIndexOf("yogi");
        // returns the index number where the sequence begins, searches for the characters from the end to the beginning of the string


        int index4 = test.indexOf("yogi");




    }
}
