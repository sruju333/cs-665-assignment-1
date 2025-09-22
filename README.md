
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | SRUJANA NIRANJANKUMAR      |
| Date         | 09/25/2025                 |
| Course       | Fall                       |
| Assignment # | 1                          |

# Assignment Overview
In this assignment, I implemented a software application to control a fully automated beverage vending machine. The vending machine can brew different types of **coffee** (Espresso, Americano, Latte, Macchiato) and **tea** (Black Tea, Green Tea, Yellow Tea).

The system allows the user to customize their drinks with condiments (milk and sugar), with a maximum of **3 units each**. Pricing is calculated based on the base price of the beverage plus $0.50 per condiment unit.

The objective was to apply **core Object-Oriented Programming concepts** such as abstraction, inheritance, encapsulation, polymorphism, and interfaces to design a flexible and maintainable solution. Per the assignment instructions, **no design patterns** were used.

# GitHub Repository Link:
https://github.com/{YOUR_USERNAME}/cs-665-assignment-{ASSIGNMENT_NUMBER}

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.
- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.
- Describe how you have avoided duplicated code and why it is important.
- If applicable, mention any design patterns you have used and explain why they were
chosen.

- **Flexibility**  
  The implementation is flexible and extensible. New beverage types can be easily added in the future by extending either the `Coffee` or `Tea` abstract classes. To add a new drink, a developer only needs to provide a constructor with the beverage’s name and base price, and implement the `brew()` method to describe the preparation steps. This minimizes the need to change existing code, making the system open for extension but closed for modification.

- **Simplicity and Understandability**  
  The class hierarchy is simple and intuitive:
    - `Condiment` interface defines milk/sugar functionality.
    - `Beverage` abstract class implements `Condiment` and defines common attributes and behavior.
    - `Coffee` and `Tea` abstract classes serve as category groupings.
    - Concrete subclasses (e.g., `Espresso`, `BlackTea`) override `brew()` with their specific preparation process.

  This design makes the system easy to read, maintain, and extend by other developers.

- **Avoiding Duplicated Code**  
  Shared behavior, such as condiment handling, validation, pricing, and beverage naming, is centralized in the `Beverage` class. This ensures that code is written once and reused across all subclasses, which reduces maintenance effort, prevents inconsistencies, and makes the implementation more reliable.

- **Design Patterns**  
  No design patterns were applied in this implementation, as specified in the assignment instructions. While the **Strategy** pattern could have been used for beverage selection and brewing, this assignment required demonstrating OOP fundamentals without patterns. Instead, a straightforward `switch` statement was used for beverage selection.


# Maven Commands

## Compile
Type on the command line: 

```bash
mvn clean compile
```


## JUnit Tests

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




