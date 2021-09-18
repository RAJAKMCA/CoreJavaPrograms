package collections;

import pojoclasses.Student;


public class StudentComparable implements Comparable<Student> {

	public int compareTo(Student student) {
		
		return student.getId();
	}



}
