package beecrowd;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }


    public static boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);
        StringBuilder reversedString = new StringBuilder();

        for (int i = numberString.length() -1 ; i >= 0 ; i-- ) {
            reversedString.append(numberString.charAt(i));
        }

        for (int i = 0; i < numberString.length(); i++) {
            if (reversedString.charAt(i) != numberString.charAt(i)){
                return false;
            }
        }


        return true;
    }
}
