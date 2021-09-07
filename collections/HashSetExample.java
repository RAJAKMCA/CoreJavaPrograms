package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a variable for HashSet type
		HashSet<String> studentsSet= new HashSet<String>();
		
		studentsSet.add("Raja");
		studentsSet.add("Ravi");
		studentsSet.add("Raja");
		
		List<String> studentSubList=new ArrayList<String>();
		studentSubList.add("Kumar");
		studentSubList.add("scott");
		studentSubList.add("Ramesh");
		studentSubList.add("Ramesh");
		
		
		
		//display elements in the set
		for(String studentName:studentsSet){
			System.out.println(studentName);
		}
		studentsSet.addAll(studentSubList);
		
		System.out.println("After added a collection of students");
		//display elements in the set
				for(String studentName:studentsSet){
					System.out.println(studentName);
				}
		
	}

}
