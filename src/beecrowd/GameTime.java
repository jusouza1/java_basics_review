package beecrowd;

import java.util.Scanner;

public class GameTime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int startTime = s.nextInt();
        int finishTime = s.nextInt();

        if (startTime == finishTime) {
            System.out.println("O JOGO DUROU 24(S)");
        } else if (startTime > finishTime) {
            int duration = 24 - startTime + finishTime;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else if (startTime < finishTime) {
            int duration = finishTime - startTime;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        }
    }
}
