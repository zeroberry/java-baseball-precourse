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
}
