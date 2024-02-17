package com.studentmanagmentsystem;

import java.util.Scanner;

import com.customexception.InvalidChoiceException;

public class Solution {
	
	
		// menu Driven Program
		// UPCASTING
		// Switch case
		// System.in
		// infinteLoop ->while(true) {}

	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IStudentManagmentSystem iStudentManagmentSystem = new StudentManagmentSystemImpl();

		while(true) {
			System.out.println(" 1. AddStudent\n 2. displayStudent\n 3. displayAllStudent\n 4. removeStudent");
			System.out.println(" 5. removeAllStudent\n 6. updateStudent\n 7. countStudent\n 8. sortStudent");
			System.out.println(" 9. EXIT");

			int choice = scanner.nextInt();

			switch(choice) {
			
				case 1:
					iStudentManagmentSystem.addStudent();
					break;
				
				case 2:
					iStudentManagmentSystem.displayStudent();
					break;
				
				case 3:
					iStudentManagmentSystem.displayAllStudents();
					break;
				
				case 4:
					iStudentManagmentSystem.removeStudent();
					break;
				
				case 5:
					iStudentManagmentSystem.removeAllStudents();
					break;
				
				case 6:
					iStudentManagmentSystem.updateStudent();
					break;
				
				case 7:
					iStudentManagmentSystem.countStudent();
					break;
				
				case 8:
					iStudentManagmentSystem.sortStudent();
					break;
				
				case 9:
					System.out.println("Thank you");
					System.exit(0);
					scanner.close();
					break;

				default :
					try{
						throw new InvalidChoiceException("Invalid Choice,Kindely enter the correct choice");
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				}	
					System.out.println("**********************");

		}

	}
}
