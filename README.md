# 🚀 Corporate Talent Hub - Control de Flujo

![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-3.9.16-blue)
![NetBeans](https://img.shields.io/badge/IDE-Apache%20NetBeans-lightgrey)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow)

## 📖 Overview

**Corporate Talent Hub - Control de Flujo** is a Java console application developed with **Apache Maven** as part of the **User Story M5.1S2**.

The main objective of this project is to evolve a basic employee management system by implementing modern programming practices, control structures, exception handling, and comparing legacy Java 8 syntax with modern Java 17/21 features.

The application allows users to register employees, store quarterly performance evaluations, calculate performance averages, classify salaries, and determine promotion status.

---

# 🎯 User Story M5.1S2 Goals

This project implements the following learning objectives:

- Build a professional Maven Java project structure.
- Compare Java 8 legacy syntax with modern Java 17/21 features.
- Implement a traditional `switch-case-break` menu.
- Use modern `Switch Expressions` with the `->` syntax.
- Apply local variable type inference using `var`.
- Manage dynamic user input with `Scanner`.
- Validate user data using conditional structures.
- Store employee performance data using multidimensional arrays.
- Calculate averages using nested loops.
- Apply explicit casting from `double` to `int`.
- Handle invalid input using exceptions.
- Use ternary operators for decision-making logic.

---

# 🛠 Technologies Used

| Technology | Version |
|---|---|
| Java | 17+ |
| Apache Maven | 3.9.16 |
| Apache NetBeans | Latest Version |
| Git | Version Control |
| GitHub | Repository Hosting |

---

# 📂 Project Structure

```text
corporate-talent-hub-control-flujo/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── corporatetalenthub/
                    │
                    ├── App.java
                    │
                    └── modelo/
                        └── Empleado.java
```

---

# ✨ Features

## 👤 Employee Management

- Register multiple employees.
- Store employee information:
  - ID
  - Name
  - Age
  - Salary

## 📊 Performance Management

- Store three quarterly performance scores.
- Calculate employee performance averages.
- Generate performance reports.
- Convert decimal averages into simplified integer scores.

Example:

```
Average: 89.67
Simplified score: 89
```

The casting intentionally removes decimal precision:

```java
(int) promedio
```

---

# 🔀 Java Version Comparison

## Java 8 - Traditional Switch

The project implements a classic menu system:

```java
switch(opcion) {
    case 1:
        // Action
        break;

    default:
        // Invalid option
        break;
}
```

Advantages:

- Compatible with older Java versions.
- Familiar syntax.

Risk:

- Forgetting `break` causes **fall-through**, executing unwanted cases.

---

## Java 17/21 - Switch Expression

Modern syntax is implemented for salary classification:

```java
return switch(rango) {
    case 1 -> "JUNIOR";
    case 2 -> "SEMISENIOR";
    case 3 -> "SENIOR";
    case 4 -> "LEADER";
    default -> throw new IllegalArgumentException();
};
```

Advantages:

- Cleaner syntax.
- Prevents accidental fall-through.
- Can directly return values.

---

# 🧠 Java Concepts Applied

## Variable Type Inference (`var`)

Modern Java allows:

```java
var nombre = "Daniel";
var edad = 25;
```

Instead of:

```java
String nombre = "Daniel";
int edad = 25;
```

Important:

`var` does not create dynamic typing. The compiler determines the type during compilation.

---

## Exception Handling

The application handles invalid keyboard input:

```java
try {
    var opcion = scanner.nextInt();

} catch(InputMismatchException exception) {

    System.out.println("Invalid input");

}
```

This prevents the application from crashing when incorrect data is entered.

---

## Arrays and Matrices

Employee evaluations are stored using:

```java
double[][] calificaciones;
```

Structure:

```text
Employee 1 → Quarter 1, Quarter 2, Quarter 3
Employee 2 → Quarter 1, Quarter 2, Quarter 3
Employee 3 → Quarter 1, Quarter 2, Quarter 3
```

Nested loops are used to process the matrix:

```java
for(row) {
    for(column) {
        // Calculate values
    }
}
```

---

# ⚙️ Installation Requirements

Before running the project, install:

- Java Development Kit (JDK) 17 or higher.
- Apache Maven.

Verify installation:

```bash
java -version
mvn -version
```

Expected result:

```text
Java version: 17+
Apache Maven: 3.9+
```

---

# 🚀 Build the Project

Clone the repository:

```bash
git clone https://github.com/vianadaniel-dev/JAVA.git
```

Navigate into the project:

```bash
cd corporate-talent-hub-control-flujo
```

Compile:

```bash
mvn clean compile
```

---

# ▶️ Run the Application

Execute:

```bash
mvn exec:java
```

The application starts with an interactive console menu.

Example:

```text
=====================================
       CORPORATE TALENT HUB
=====================================

1. Register employee
2. Show performance report
3. Salary categories
0. Exit
```

---

# 🧪 Testing Scenarios

The application validates:

✅ Invalid menu options  
✅ Duplicate employee IDs  
✅ Empty names  
✅ Invalid ages  
✅ Invalid salaries  
✅ Invalid performance scores  
✅ Incorrect keyboard input  
✅ Empty reports  

---

# 📌 Project Status

🚧 **Currently under development**

Implemented:

- Maven project configuration
- Java project structure
- Version control with Git
- Initial application setup

Pending:

- Employee model implementation
- Menu development
- Performance calculation logic
- Exception handling implementation

---

# 👨‍💻 Author

**Daniel Viana**

Java learning project focused on:

- Object-oriented programming
- Java evolution from version 8 to modern LTS versions
- Clean project structure
- Professional development workflow

---

# 📄 License

This project is created for educational purposes.
