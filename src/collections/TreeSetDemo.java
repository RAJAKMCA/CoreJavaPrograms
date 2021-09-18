package collections;

import java.util.HashSet;
import java.util.TreeSet;

import pojoclasses.Student;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet demo
		HashSet<Integer> numbersHashSet=new HashSet<Integer>();
		// adding an elements into a treeset
		numbersHashSet.add(10012344);
		numbersHashSet.add(3);
		numbersHashSet.add(88788);
		numbersHashSet.add(2);
		numbersHashSet.add(1332322);
		numbersHashSet.add(8);
		
		System.out.println("If we observ output we can understand hashset elements in HashSet preserved in insertion order !!!");
		//printing  HashSet numbers
		for(Integer number:numbersHashSet){
			System.out.println(number);
		}
		
		// adding String type of elements into a HashSet
		HashSet<String> studentNamesSet=new HashSet<String>();
		studentNamesSet.add("Xaviour");
		studentNamesSet.add("Scott");
		studentNamesSet.add("Alen");
		studentNamesSet.add("Maxwell");
		studentNamesSet.add("Long");
				
				System.out.println("If we observ output we can understand hashset elements in HashSet not preserved in insertion order!!!");
				//printing  HashSet numbers
				for(String name:studentNamesSet){
					System.out.println(name);
				}
		
		
		TreeSet<Integer> numbersTreeSet=new TreeSet<Integer>();
		// adding an elements into a treeset
		numbersTreeSet.add(10012344);
		numbersTreeSet.add(3);
		numbersTreeSet.add(88788);
		numbersTreeSet.add(2);
		numbersTreeSet.add(1332322);
		numbersTreeSet.add(8);
		
		System.out.println("If we observ output we can understand collection elements are in sorted order");
		//printing  Treeset numbers
		for(Integer number:numbersTreeSet){
			System.out.println(number);
		}
		
		// adding String type of elements into a HashSet
		TreeSet<String> studentTreeset=new TreeSet<String>();
		studentTreeset.add("Xaviour");
		studentTreeset.add("Scott");
		studentTreeset.add("Alen");
		studentTreeset.add("Maxwell");
		studentTreeset.add("Long");
				
				System.out.println("If we observ output we can understand hashset elements in TreeSet not preserved in insortion order but kept in sorted order!!!");
				//printing  HashSet numbers
				for(String name:studentTreeset){
					System.out.println(name);
				}
		
		
				//Add userdefined studenttype objects into a TreeSet
				
				TreeSet<Student> studentTypeTreeSet=new TreeSet<Student>();
				
				studentTypeTreeSet.add(new Student(101,"Xaviour","HYD"));
				studentTypeTreeSet.add(new Student(10234,"Scott","NewYork"));
				studentTypeTreeSet.add(new Student(10211,"Alen","HYD"));
				studentTypeTreeSet.add(new Student(10111,"Maxwell","HYD"));
				studentTypeTreeSet.add(new Student(10231,"Long","HYD"));
						
						System.out.println("If we observ output we can understand hashset elements in TreeSet not preserved in insortion order but kept in sorted order!!!");
						//printing  HashSet numbers
						for(Student studentType:studentTypeTreeSet){
							System.out.println(studentType.toString());
						}
				
	}

}
