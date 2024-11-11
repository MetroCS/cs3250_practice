package metrocs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecisionCriteriaUI {
    private final List<String> criteriaList;

    public DecisionCriteriaUI() {
        criteriaList = new ArrayList<>();
    }

    // Method to add a new criterion to the list
    public void addCriteria(String criteriaName) {
        criteriaList.add(criteriaName);
    }

    // Method to get all criteria
    public List<String> getCriteriaList() {
        return criteriaList;
    }

    // Method to prompt user for criteria entry
    public void promptForCriteria() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter decision criteria. Type 'done' when you are finished:");

        while (true) {
            System.out.print("Enter criterion: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }
            addCriteria(input);
            System.out.println("'" + input + "' has been added.");
        }
        
        scanner.close();
    }

    // Display all entered criteria
    public void displayCriteria() {
        System.out.println("You have entered the following criteria:");
        for (String criteria : criteriaList) {
            System.out.println("- " + criteria);
        }
    }
}
