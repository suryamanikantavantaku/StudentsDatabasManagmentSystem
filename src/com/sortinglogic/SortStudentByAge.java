package com.sortinglogic;

import java.util.Comparator;

import com.studentmanagmentsystem.Student;

public class SortStudentByAge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStudentAge()-s2.getStudentAge();
	}

}
