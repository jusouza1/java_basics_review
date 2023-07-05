package practice.loops;

public class LoopsPractice {


    public static void main(String[] args) {
        String str = "We have a large inventory if things in our warehouse "
                + "falling in the category:apperal and the slightly more in demand "
                + "category:makeup along with the category:furniture and...";

        printCaregories(str);


        int count = 0;
        while (count <= 100) {
            System.out.println("Ju" + " " + count);
            count++;

            if (count == 30)
                break;
        }
    }

    /*
    extract all categories from the string argument
     */
    public static void printCaregories(String str) {
       int i = 0;

       while (true) {
           int found = str.indexOf("category:", i);
           if (found == -1) break;
           int start = found + 9;
           int end = str.indexOf(" ", start);
           // the second argument indicates the index where to start looking for the character
           System.out.println(str.substring(start, end));
           i = end + 1;
       }
    }
}
