import java.util.Scanner;

public class BaseballController {
    private final BaseballView baseballView;
    private final Scanner scanner = new Scanner(System.in);

    public BaseballController(BaseballView baseballView) {
        this.baseballView = baseballView;
    }

    public int[] getInput() {
        while (true) {
            try {
                String input = scanner.nextLine();

                String[] splittedString = input.split("");

                if (splittedString.length == 3) {
                    return new int[]{
                            Integer.parseInt(splittedString[0]),
                            Integer.parseInt(splittedString[1]),
                            Integer.parseInt(splittedString[2]),
                    };
                }

                baseballView.printInputErrorMessage();
            } catch (NumberFormatException e) {
                baseballView.printInputErrorMessage();
            }
        }
    }

    public boolean getExitOrRestartInput() {
        while (true) {
            try {
                String input = scanner.nextLine();

                int num = Integer.parseInt(input);

                if (num == 1) {
                    return false;
                } else if (num == 2) {
                    return true;
                }

                baseballView.printInputErrorMessage();
            } catch (NumberFormatException e) {
                baseballView.printInputErrorMessage();
            }
        }

    }
}
