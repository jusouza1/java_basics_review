package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'getMinimumMoves' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY quantity as parameter.
     */

    public static void main(String[] args) {
        Integer[] array = {5, 3, 3, 6, 3, 9};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        System.out.println(getMinimumMoves(list));
    }

    public static long getMinimumMoves(List<Integer> quantity) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        Integer sum = 0;
        Integer sum2 = 0;
        long moves = 0;

        if (quantity.size() % 2 == 0) {
            var size = quantity.size() / 2;

            for (var i = 0; i < size; i++) {
                listOne.add(quantity.get(i));
                sum = sum + quantity.get(i);
            }
            System.out.println(sum);

            for (var i = size; i < quantity.size() ; i++ ){
                listTwo.add(quantity.get(i));
                sum2 = sum2 + quantity.get(i);
            }
            System.out.println(sum2);

            var difference = sum - sum2;

            if (difference == 0) {
                return 0L;
            } else {
                moves = difference;
                if (difference < 0) {
                    return moves * (-1);
                }
                return moves;
            }
        }
        else {
            var size  = quantity.size() - 1;
            var firstHalf = (size/2) + 1;
            var secondeHalf = size/2;

            for (var i = 0; i < firstHalf; i++) {
                listOne.add(quantity.get(i));
                sum = sum + quantity.get(i);
            }

            for (var i = firstHalf; i < secondeHalf ; i++ ){
                listTwo.add(quantity.get(i));
                sum2 = sum2 + quantity.get(i);
            }

            var difference = sum - sum2;

            if (difference == 0) {
                return 0L;
            } else {
                moves = difference;
                if (difference < 0) {
                    return moves * (-1);
                }
                return moves;

            }

        }


    }

}
