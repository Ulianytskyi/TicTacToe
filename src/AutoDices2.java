import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class AutoDices2 {
    static int a1, a2, b1, b2;
    static int score1 = 0;
    static int score2 = 0;
    static boolean state = true;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (state) {
            if (in.next().equals("x")) {
                state = false;
            }
            else {
                fight();
            }
        }
        scores();
    }
    public static void fight() {
        a1 = randomizer();
        a2 = randomizer();
        b1 = randomizer();
        b2 = randomizer();
        System.out.println("You have: " + a1 + " " + a2);
        System.out.println("Enemy have: " + b1 + " " + b2);

        String winner = (a1+a2 > b1+b2) ? "win" : "lose";
        if (winner == "win") {
            score1+=1;
        }
        else {
            score2+=1;
        }
        System.out.println("You " + winner + "!\n");
    }
    public static void scores() {
        System.out.println("\nFinal score:");
        System.out.println("You - " + score1 + " : " + score2 + " - Enemy");
    }
    public static int randomizer() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
