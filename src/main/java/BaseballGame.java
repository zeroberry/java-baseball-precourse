public class BaseballGame {
    final private BaseballView baseballView;
    final private BaseballController baseballController;
    final private BaseballScore baseballScore;

    public BaseballGame(BaseballView baseballView, BaseballController baseballController, BaseballScore baseballScore) {
        this.baseballView = baseballView;
        this.baseballController = baseballController;
        this.baseballScore = baseballScore;
    }

    public void start() {
        baseballScore.resetNumbers();

        while (true) {
            tick();
        }
    }

    private void tick() {
        baseballView.printTurnInputMessage();
        int[] inputNumbers = baseballController.getInput();
        TurnResult result = baseballScore.calculateResult(inputNumbers);
        baseballView.printScore(result);
    }
}
