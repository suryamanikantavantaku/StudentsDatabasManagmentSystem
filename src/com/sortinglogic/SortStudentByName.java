package com.sortinglogic;

import java.util.Comparator;

import com.studentmanagmentsystem.Student;

public class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStudentName().compareTo(s2.getStudentName());
	}

}
