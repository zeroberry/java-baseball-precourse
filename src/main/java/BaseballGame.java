import java.util.Random;

public class BaseballGame {
    final private BaseballView baseballView;
    final private BaseballController baseballController;

    public BaseballGame(BaseballView baseballView, BaseballController baseballController) {
        this.baseballView = baseballView;
        this.baseballController = baseballController;
    }

    private int[] numbers;

    public void start() {
        numbers = getRandomNumbers();

        while (true) {
            tick();
        }
    }

    private void tick() {
        baseballView.printTurnInputMessage();
        int[] inputNumbers = baseballController.getInput();
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
