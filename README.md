
# Project Title

# Student Database Management System

## Overview
The Student Database Management System is a Java-based console application developed to manage student information efficiently. It allows users to perform various tasks related to student data, such as adding, viewing, updating, and removing student records. The application utilizes custom exceptions for error handling and provides sorting options for the user.
The data structure used to store is LinkedHashMap and other Collections like List. Written sorting logic on each data and
created a custom exception forthe program.

## Features
- **Add Student:** Add new student information to the database.
- **View Student:** Display details of a specific student using their ID.
- **View All Students:** Display a list of all students in the database.
- **Remove Student:** Remove a student from the database based on their ID.
- **Remove All Students:** Remove all student records from the database.
- **Update Student:** Modify existing student information.
- **Count Students:** Display the total number of student records.
- **Sort Students:** Sort and display students based on ID, name, age, or marks.

## Technologies Used
- Java
- Eclipse IDE

1.Open the project in Eclipse IDE.

2.Run the Solution class to start the application.

## Usage
    -Follow the on-screen menu to perform various operations.
Choose options to add, view, update, or remove student records.Utilize sorting options to display students based on different   criteria.
Exit the application when done.

# Custom Exceptions

## 1. InvalidChoiceException

### Description
Thrown for invalid user choices in the application menu.

### Example
If the user enters an option outside the provided menu choices, the application throws an `InvalidChoiceException`.

## 2. StudentNotFoundException

### Description
Thrown when a student ID is not found

### Example
If the user tries to view or update a student with an ID that doesn't exist in the database, the application throws a StudentNotFoundException.







