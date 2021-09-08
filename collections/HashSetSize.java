package collections;

import java.util.HashSet;

import pojoclasses.Student;

public class HashSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student> studentSet=new HashSet<Student>();
		Student student1=new Student();
		student1.setId(101);
		student1.setName("Ravi");
		student1.setAddress("Hyd");
		
		Student student2=new Student();
		student2.setId(101);
		student2.setName("Ravi");
		student2.setAddress("Hyd");
		
		Student student3=new Student();
		student3.setId(101);
		student3.setName("Ravi");
		student3.setAddress("Hyd");
		
		//adding student1
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		//Before override hashcode and equals output
		
		/*studentSet size:3
		101 and hasCode:2018699554
		101 and hasCode:366712642
		101 and hasCode:1829164700*/
		
		System.out.println("studentSet size:"+studentSet.size());
		for(Student st1:studentSet){
			System.out.println(st1.getId()+" and hasCode:"+st1.hashCode());
		}
		
		
		
	}

}
