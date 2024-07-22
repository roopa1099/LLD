package Snake;

import java.util.concurrent.ThreadLocalRandom;

&Ladder;

public class Dice {
    int number_of_dice;

    int rollDice() {
        int sum = 0;
        for (int i = 1; i <= number_of_dice; i++) {
            int generateNumber = ThreadLocalRandom.current().nextInt(0, 7);
            sum += generateNumber;
        }
        return sum;
    }
}
