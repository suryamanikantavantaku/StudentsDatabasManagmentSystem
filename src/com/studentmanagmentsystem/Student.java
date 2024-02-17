package com.studentmanagmentsystem;

public class Student {
	private String studentId;
	private String studentName;
	private int studentAge;
	private int studentMarks;
	
	private static int count = 101;
	
	

	public Student(String studentName, int studentAge, int studentMarks) {
		this.studentId = "STUDENT"+count;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		count++;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student -->  studentId =" + studentId + ", studentName =" + studentName + ", studentAge =" + studentAge
				+ ", studentMarks =" + studentMarks;
	}
	
	
	
	
	

	
	
}
