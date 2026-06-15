# Library Management System

A Java-based university library management system that handles multiple department libraries, books, members, employees, cubicles, computers, transactions, and fines.

## Features

- Multiple library support (CS, EE, Management Sciences)
- Book, member, and employee management
- Cubicle and computer resource tracking
- Book transactions (issue/return)
- Fine calculation for overdue books
- Member feedback system
- Swing-based GUIs

## Tech Stack

- Java (JDK 8+)
- Java Swing
- OOP Concepts (Inheritance, Abstraction, Polymorphism, Interfaces)

## Project Structure

```
├── University.java      - Container for libraries
├── Library.java         - Individual library
├── Person.java          - Abstract base class
├── Member.java          - Member details
├── Employee.java        - Staff details
├── Books.java           - Book management
├── Cubicle.java         - Study cubicles
├── Computers.java       - Computer resources
├── bookTransaction.java - Borrow/return records
├── Fine.java            - Fine calculation
├── libraryRules.java    - Library policies
├── memberFeedback.java  - Feedback system
├── libraryOperations.java - Interface
└── Demo.java            - Main class
```

## How to Run

```bash
javac librarymanagementsystem/*.java
java librarymanagementsystem.Demo
```

## Sample Output

```
Books in CS library: [Book{bookID=50, bookName=Harry Potter...}]
total no of book in libraries: 6
total no of computers in libraries: 6
total no of Employee in libraries: 6
```
