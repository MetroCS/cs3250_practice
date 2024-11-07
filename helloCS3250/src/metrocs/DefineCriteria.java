import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefineCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> decisions = new ArrayList<>();
        String input;

        System.out.println("Enter your decision criteria (type '1' to stop):");

        while (true) {
            input = scanner.nextLine();

            if (input.equals("1")) {
                break;
            }

            decisions.add(input);
            System.out.println("Criteria added. Enter next criteria (or '1' to stop):");
        }

        scanner.close();

        System.out.println("You entered the following criteria:");
        for (String decision : decisions) {
            System.out.println(decision);
        }
    }
}