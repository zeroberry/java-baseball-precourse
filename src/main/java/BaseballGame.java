import java.util.Arrays;
import java.util.Random;

public class BaseballGame {
    private int[] numbers;

    public void start() {
        numbers = getRandomNumbers();
    }

    private int[] getRandomNumbers() {
        Random rand = new Random();

        return new int[]{
                rand.nextInt(10),
                rand.nextInt(10),
                rand.nextInt(10)
        };
    }
}
