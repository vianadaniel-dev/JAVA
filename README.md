````md
# Corporate Talent Hub - Control de Flujo

## 📖 Description

**Corporate Talent Hub - Control de Flujo** is a Java console application built with **Maven**. This project was developed as part of **User Story M5.1S2**, focusing on control flow, exception handling, and comparing legacy Java 8 syntax with modern Java 17/21 features.

The application allows users to register employees, store their quarterly performance evaluations, and generate performance reports.

---

## 🎯 Objectives

- Implement a main menu using the traditional `switch` statement (Java 8).
- Use **Switch Expressions** (`->`) introduced in modern Java versions.
- Capture user input with `Scanner`.
- Use `var` for local variable type inference.
- Validate input using `if / else` statements.
- Store employee performance using a two-dimensional array (`double[][]`).
- Calculate averages with nested `for` loops.
- Demonstrate explicit casting from `double` to `int`.
- Handle invalid input with `try-catch` and `InputMismatchException`.
- Use the ternary operator to determine employee promotion status.

---

## 🛠 Technologies

- Java 17 (compatible with Java 21+)
- Apache Maven
- Apache NetBeans
- Git
- GitHub

---

## 📁 Project Structure

```text
corporate-talent-hub-control-flujo/
│
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── corporatetalenthub/
                    ├── App.java
                    └── modelo/
                        └── Empleado.java
````

---

## ✨ Features

* Employee registration
* Quarterly performance tracking
* Performance average calculation
* Salary category classification
* Promotion status evaluation
* Input validation
* Exception handling

---

## 📋 Requirements

* JDK 17 or later
* Apache Maven 3.9 or later

Verify your installation:

```bash
java -version
mvn -version
```

---

## 🚀 Build

Compile the project with:

```bash
mvn clean compile
```

---

## ▶️ Run

Execute the application:

```bash
mvn exec:java
```

---

## 👨‍💻 Author

**Daniel Viana**

Academic project developed to practice Java programming concepts, control flow, exception handling, and the evolution of the language from Java 8 to Java 17/21.

---

## 📄 License

This project is intended for educational purposes.

```
```
