package beecrowd;

import java.util.Scanner;

public class GameTimeWithMinutes {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 1047 - Tempo de Jogo com Minutos

        int startHour = s.nextInt();
        int startMinute = s.nextInt();
        int finishHour = s.nextInt();
        int finishMinute = s.nextInt();

        // hora inicial igual a hora final
        // hora inicial menor que a final e minuto inicial menor que o final
        // hora inicial menor que a final e minuto inicial maior que o final
        // hora inicial maior que a final e minuto inicial maior que o final
        // hora inicial maior que a final e minuto inicial menor que o final


        int hours = finishHour - startHour;
        int minutes = finishMinute - startMinute;


        if(hours < 0){
            hours = (finishHour+24)-startHour;
        }
        if(minutes < 0){
            minutes = (finishMinute+60)-startMinute;
            hours--;
        }


        if (minutes == 0 && hours == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
        }
    }
}

// 22 10
// 5 30




