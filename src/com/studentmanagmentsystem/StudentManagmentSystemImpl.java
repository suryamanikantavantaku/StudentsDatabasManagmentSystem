package com.studentmanagmentsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customexception.InvalidChoiceException;
import com.customexception.StudentNotFoundException;
import com.sortinglogic.SortStudentByAge;
import com.sortinglogic.SortStudentById;
import com.sortinglogic.SortStudentByMarks;
import com.sortinglogic.SortStudentByName;

public class StudentManagmentSystemImpl implements IStudentManagmentSystem {





	Map<String, Student> map=new LinkedHashMap<String,Student>();

	Scanner scanner = new Scanner(System.in);



	@Override
	public void addStudent() {

		
		/**
		 * Adding Students records
		 */

		// Accept name,age& marks
		// Student object

		System.out.println("Enter the name : ");
		String name = scanner.next();

		System.out.println("Enter the age : ");
		int age = scanner.nextInt();

		System.out.println("Enter the marks : ");
		int marks = scanner.nextInt();

		Student student = new Student(name,age,marks);
		map.put(student.getStudentId(),student);

		System.out.println(" Student record  Sucessfully Inserted ");
		System.out.println(" Your Student id is : "+student.getStudentId());


	}

	@Override
	public void displayStudent() {

		System.out.println("enter the Student_Id :");
		String id = scanner.next();
		id = id.toUpperCase();

		if(map.containsKey(id)) {
			Student student = map.get(id);
			System.out.println("Id  :"+student.getStudentId());
			System.out.println("Name :"+student.getStudentName());
			System.out.println("Age :"+student.getStudentAge());
			System.out.println("marks :"+student.getStudentMarks());

		}else {
			try {
				throw new StudentNotFoundException("Id you Entered is not valid");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}

	@Override
	public void displayAllStudents() {
		
				// Map-> Set of keys
				//for -> get()
				/**
				 * converting map to KeySet and traverse using for-each loop
				 * 
				 */


		Set<String> keys = map.keySet();

		System.out.println(" Student Record are as follow ");
		System.out.println("-------------------------------");
		if(map.size() != 0) {
			for(String key  : keys) {
				System.out.println(key);
			}
		}
		else {
			try {
				throw new StudentNotFoundException("Student data is not available in Database");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeStudent() {
		
				// Accept the Id -> String
				//upperCase
				// containsKey()
				//remove()
				//else -> SNFE ->handle
		
		
		System.out.println("enter the Student_Id :");
		String id = scanner.next();
		id = id.toUpperCase();

		if(map.containsKey(id)) {
			map.remove(id);
			System.out.println("Student Record Deleted Successfully");
		}else {
			try {
				throw new StudentNotFoundException("Student id is not found");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAllStudents() {

		System.out.println(map.size()+" Student Records are present");
		map.clear();
		System.out.println("All Students  Records Deleted Sucessfully ");

	}

	@Override
	public void updateStudent() {
		
		
				// Accept Id & upperCase , containsKey,get the Student object
				//switch case 1: update name,age,marks
				// invoke exception
		
		
		
		System.out.println("Enter the Student ID");
		String id = scanner.next();
		id = id.toUpperCase();
		
		if(map.containsKey(id)) {
			Student student = map.get(id);
			System.out.println();
			System.out.println("1. updateStudentName\n 2. updateStudentAge\n 3. updateStudentMarks");
			System.out.println("Enter the choice");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter the Update name : ");
					student.setStudentName(scanner.next());
				
					break;
				
				case 2:
					System.out.println("Enter the Update Age : ");
					student.setStudentAge(scanner.nextInt());
					
					break;
					
				case 3:
					System.out.println("Enter the Update Marks : ");
					student.setStudentMarks(scanner.nextInt());
					
					break;
			
			default :
				try {
					throw new InvalidChoiceException("Enter Choice is not Valid ");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
				
		}
	}

	@Override
	public void countStudent() {
		
		System.out.println("Total number of Student Record :"+map.size());
	}

	@Override
	public void sortStudent() {
		
		
		/**
		 * converting map to KeySet()
		 * UPcasting list to ArrayList and Storing Students object
		 *
		 * Traverse using for-each loop and get the values of Student object and store it in ArrayList
		 *  
		 * 
		 */

		//Convert Map into Set -> KeySet()
		//List & ArrayList -> Student
		// for-each, get the values (Student objects) and store it in AL
S
		
		Set<String> keys = map.keySet();
		
		List<Student> studentList = new ArrayList<Student>();
		
		for(String key : keys) {
			studentList.add(map.get(key));
		}
		
		System.out.println("1.SortStudentById\n2.SortStudentByName\n3.SortStudentByAge");
		System.out.println("4.SortStudentByMarks");
		System.out.println("Enter the choice");
		int choice=scanner.nextInt();
		
		switch(choice) {
			case 1:
				Collections.sort(studentList, new SortStudentById());
				display(studentList);
				
				break;
				
			case 2:
				Collections.sort(studentList, new SortStudentByName());
				display(studentList);
				
				break;
				
			case 3:
				Collections.sort(studentList, new SortStudentByAge());
				display(studentList);
				
				break;
				
			case 4:
				Collections.sort(studentList, new SortStudentByMarks());
				display(studentList);
				
				break;
				
			default:
				try {
					throw new InvalidChoiceException("Choice entered is not valid");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
	
		private static void display(List<Student> list) {
			for(Student studentList : list) {
				System.out.println(studentList);
			}
		}

}
