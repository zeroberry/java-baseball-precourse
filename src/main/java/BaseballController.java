import java.util.Scanner;

public class BaseballController {
    private final Scanner scanner = new Scanner(System.in);

    public int[] getInput() {
        String input = scanner.nextLine();

        String[] splittedString = input.split("");

        return new int[]{
                Integer.parseInt(splittedString[0]),
                Integer.parseInt(splittedString[1]),
                Integer.parseInt(splittedString[2]),
        };
    }

    public boolean getExitOrRestartInput() {
        String input = scanner.nextLine();

        int num = Integer.parseInt(input);

        if(num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        }

        // TODO: 별도 핸들링
        return false;
    }
}
