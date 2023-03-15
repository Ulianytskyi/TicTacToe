

// це прототип гри де різні персонажі грають один з одним в дайси

import java.util.Random;

public class AutoDices {
    public static String diceResult;

    public static void main(String[] args) {

        int a = randomizer();
        int b = randomizer();
        int dice1 = a+1;
        int dice2 = b+1;
        String res1 = diceCheck(dice1);
        String res2 = diceCheck(dice2);
        System.out.println("Your roll is\n" + res1);
        System.out.println("Enemy roll is\n" + res2);

    }

    public static int randomizer() {
        Random random = new Random();
        return random.nextInt(6);
    }
    public static String diceCheck(int dice) {
        switch (dice) {
            case 1:
                //diceResult = "...\n.0.\n...";
                diceResult = "|   |\n| o |\n|   |";
                break;
            case 2:
                //diceResult = "0..\n...\n..0";
                diceResult = "|o  |\n|   |\n|  o|";
                break;
            case 3:
                //diceResult = "0..\n.0.\n..0";
                diceResult = "|o  |\n| o |\n|  o|";
                break;
            case 4:
                //diceResult = "0.0\n...\n0.0";
                diceResult = "|o o|\n|   |\n|o o|";
                break;
            case 5:
                //diceResult = "0.0\n.0.\n0.0";
                diceResult = "|o o|\n| o |\n|o o|";
                break;
            case 6:
                //diceResult = "0.0\n0.0\n0.0";
                diceResult = "|o o|\n|o o|\n|o o|";
                break;
        }

        return diceResult;
    }
}

