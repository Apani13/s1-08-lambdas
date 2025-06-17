# 🛠️ Java Lambdas Practice

## 📝 Description

This repository is dedicated exclusively to **Java Lambdas and Streams (Java 8+)**, a powerful and expressive feature of modern Java. The goal of this sprint is to become fluent in functional-style programming and lambda expressions through hands-on exercises.

## 🚀 Objectives

* Practice Java lambda expressions and method references.
* Understand and use the Java Streams API.
* Create and apply Functional Interfaces.
* Learn how to use lambdas for filtering, sorting, and transforming collections.

## 📚 Exercise Overview

### 🔹 Level 1

#### Exercise 1 – Filter Strings Containing 'o'

* **What it does:** Filters a list of strings and returns those that contain the letter 'o'.
* **Learning focus:**

    * Lambda filtering.
    * Stream API basics.

#### Exercise 2 – Filter Strings Containing 'o' and Longer Than 5

* **What it does:** Filters a list of strings to return only those that contain the letter 'o' and are longer than 5 characters.
* **Learning focus:**

    * Combining multiple lambda conditions.
    * Fluent Stream chaining.

#### Exercise 3 – Print Months Using Lambda

* **What it does:** Creates a list with all the months of the year and prints them using a lambda.
* **Learning focus:**

    * Using `forEach()` with lambda expressions.

#### Exercise 4 – Print Months Using Method Reference

* **What it does:** Same as Exercise 3, but uses a method reference instead of a lambda.
* **Learning focus:**

    * Syntax and use of method references.

#### Exercise 5 – Functional Interface getPiValue()

* **What it does:**

    * Creates a Functional Interface with a method `getPiValue()` returning a double.
    * Instantiates it in the `main()` method to return the value `3.1415` and prints the result.
* **Learning focus:**

    * Functional Interfaces and lambda assignment.

#### Exercise 6 – Sort List from Shortest to Longest

* **What it does:** Sorts a mixed list of numbers and strings from shortest to longest strings.
* **Learning focus:**

    * Custom comparators.
    * Sorting with lambdas.

#### Exercise 7 – Sort List from Longest to Shortest

* **What it does:** Sorts the same list as in Exercise 6 but in reverse (longest to shortest).
* **Learning focus:**

    * Reversing sort logic with lambdas.

#### Exercise 8 – Functional Interface to Reverse Strings

* **What it does:**

    * Creates a Functional Interface with method `reverse(String)`.
    * Implements the logic via lambda to return the reversed version of the input string.
* **Learning focus:**

    * Passing behavior as code.
    * Reversing strings using lambdas.

## ⚙️ Technologies Used

* Java 8+
* Eclipse or IntelliJ IDEA
* GitHub

## 📋 Requirements

* Java JDK 8 or higher
* Git for version control
* IDE (Eclipse or IntelliJ)

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-08-lambdas.git
```

Open the project in IntelliJ IDEA or Eclipse and make sure Java 8+ is selected as the SDK.

## ▶️ Execution

All exercises are executable via **terminal**. Example structure:

```
/<project-root>
├── src/
│   └── level01/exercise1/...  (Java source files)
└── bin/                      (compiled class files)
```

### Compile

```bash
javac -d bin src/level01/exercise1/*.java
```

### Run

```bash
java -cp bin level01.exercise1.Main
```

Repeat the commands accordingly for other exercises.

## 🤝 Contributions

1. Fork the repository.
2. Create your branch: `git checkout -b feature/MyFeature`
3. Commit changes: `git commit -m "Add MyFeature"`
4. Push your branch: `git push origin feature/MyFeature`
5. Open a pull request.

## ✅ Author Notes

These lambda-focused exercises are essential for mastering modern Java programming. Whether it's filtering a list, sorting by logic, or creating clean one-liner operations, this module will help you think functionally and write more elegant Java code.

Happy coding! 🚀
