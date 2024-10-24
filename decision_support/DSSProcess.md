# Decision Support Process and Computations

## 1. Introduction

### Purpose
The Decision Support System (DSS) is designed to help users make informed decisions by evaluating multiple alternatives against a set of factors. The system uses pairwise comparison to assess the relative importance of factors and the performance of alternatives in relation to those factors. The ultimate goal is to produce a final ranking of alternatives based on their weighted scores.

### Overview
The DSS follows a structured process where users input alternatives and factors, perform relative comparisons, and then calculate scores based on weighted sums. The system is designed to be flexible, allowing customization of certain steps, such as final score normalization, and ensuring error handling (e.g., division by zero) is managed gracefully. Java is the recommended language for implementation, and the initial version will feature a command-line interface, which can later be extended to support a graphical or web-based interface.

## 2. System Components

### Factors:
Factors are criteria used to evaluate the alternatives. They are identified by textual descriptions provided by the user (e.g., "Cost," "Quality," "Time"). Factors also have associated numeric ranks, which reflect their relative importance in decision-making.

#### Input Format
The format for identifying factors is left up to the product user. This can be a descriptive string or an alphanumeric code.

#### Rank
The product will determine the relative rank of each factor based on pairwise comparisons provided by the user.

### Alternatives
Alternatives represent the options available for decision-making. Each alternative is evaluated against the factors, and a final score is calculated.

_Input Format:_ The format for identifying alternatives is also flexible and defined by the product user.  
_Final Score:_ The final score of each alternative is determined through a weighted sum of its performance in relation to each factor.

## 3. Pairwise Comparison for Ranking

### Input
The product user provides pairwise comparisons of factors and alternatives. Instead of only indicating which item is more important, the user assigns relative values to show the comparative importance. These values reflect the proportional difference between items.

### Factor Comparison
The user compares factors by assigning a relative value to each. For example, if Factor A is twice as important as Factor B, Factor A might receive a value of 10 and Factor B a value of 5. If Factor A is three times as important, the values could be 30 and 10, respectively.
Alternative Comparison: For each factor, the user compares two alternatives and assigns relative values based on their performance in relation to that factor. For instance, if Alternative 1 performs three times better than Alternative 2 in a certain factor, their values might be 30 and 10, respectively.

### Processing
The system calculates the overall ranking of factors and alternatives based on the relative values provided in the pairwise comparisons. Factor rankings are independent of the alternative rankings within each factor, allowing the user to treat these rankings separately.

### Error Handling

#### Factor Ranking
Since factor rankings are independent of alternative rankings within factors, the system is configured so that no conflicting information can arise in the factor rankings. However, the system may allow incomplete rankings to give the product user more flexibility in providing input.

#### Incomplete Comparisons
The system should prompt the user when pairwise comparisons are missing, but incomplete information is acceptable if the user prefers greater flexibility.

## 4. Cross-Ranking Matrix (Conceptual)

### Purpose
The conceptual cross-ranking matrix represents the relative importance of each alternative for each factor. It serves as an intermediate step in calculating final scores but does not need to be explicitly implemented as a matrix in the code.

## 5. Normalization

- Step 1: Normalize the cross-rankings within each factor by dividing the value of each cross-ranking by the sum of all cross-rankings for that factor.
- Step 2: Handle division errors, such as division by zero, by identifying and reporting them to the user without crashing the system.

## 6. Weighted Sum Calculation

#### Process:
Compute the weighted sum for each alternative by multiplying the normalized cross-rankings with the corresponding factor’s rank. The result is the weighted sum for each alternative.

## 7. Final Score Normalization

#### Optional Normalization
The final score normalization step is not mandatory, but it should be the default behavior.
Product users can customize this step by determining a constant, such as scaling scores to 100,
or they may choose to skip this step entirely.

## 8. Error Handling

### Input Validation
Validate user input for consistency and completeness, especially in pairwise comparisons. Ensure that all comparisons are accounted for and make sense relative to each other.

### Error Reporting
Report any identified errors, such as missing comparisons or division by zero, to the user with clear messages, ensuring that the application does not crash as a result.

## 9. Architecture & Implementation

### Programming Language/Framework
Java is the recommended language for this project, given its familiarity among developers and suitability for implementing command-line and graphical interfaces.

### Command-Line Interface
The initial implementation should be a command-line interface, which can later be extended to support a graphical or web-based interface.

### Future Extensibility
Consider designing the system to allow for future upgrades and enhancements, such as replacing the CLI with a GUI or web-based interface.

## 10. Conclusion

The Decision Support System (DSS) aims to facilitate informed decision-making through structured input and calculations. By allowing pairwise comparisons and weighted scoring, the system provides a reliable method for evaluating multiple alternatives based on a set of defined factors. The DSS is designed to be flexible, customizable, and extensible, enabling further development and user-specific adaptations.

----
Derived from [Decision Support Process](https://metrocs.github.io/cs3250_practice/DecisionSupportProcess.html) using ChatGPT 4o.
