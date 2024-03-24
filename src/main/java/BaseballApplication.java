public class BaseballApplication {
    public static void main(String[] args) {
        BaseballView baseballView = new BaseballView();
        BaseballController baseballController = new BaseballController();
        BaseballGame baseballGame = new BaseballGame(baseballView, baseballController);

        baseballGame.start();
    }
}