package beecrowd;

public class RepeatedSubstring {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababba"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder finishedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            if (s.contains(stringBuilder.toString()) &&
                    (s.contains(stringBuilder + stringBuilder.toString()))) {
                finishedString.append(stringBuilder);
            }
        }
        return finishedString.toString().equals(s);

    }
}
