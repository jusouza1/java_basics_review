package practice.loops;

public class ForLoops {

    public static void main(String[] args) {
        String name = "huhsudhfushfuisdhfidsf";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println("char: "+ name.charAt(i));
        }

        for (int i = 0; i <= 100; i++) {
            if((i % 2) == 0){
                System.out.println("i " + i);
            }
        }

        for (int i = 0; i <= 100; i+=5) {
                System.out.println("i " + i);
            }

        int counter = 0;

        for(int i = 0; i<=100; i++) {
            System.out.println(i);
            int temp = counter + 1;
            counter = temp;
        }


        for(int idx = 0;idx < 100; idx++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("the value of idx was" + idx);
            }
        }
        // it is better to avoid nested loops
    }





    }

