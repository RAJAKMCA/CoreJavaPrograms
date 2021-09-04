package collectionexamples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//creating an ArrayList
	ArrayList<String> studentNamesList=new ArrayList<String>();
	
	//adding an elements into an arrayList
	studentNamesList.add("Ravi");
	studentNamesList.add("Kumar");
	studentNamesList.add("John");
	studentNamesList.add("Devi");
	studentNamesList.add("Nissi");
	
	
	System.out.println("################Display Elements");
	//Display elements from above list
			for(String studentName:studentNamesList){
				System.out.println(studentName);
			}
	//adding an element at desired position
			System.out.println("################Adding an element at 5th postion");		
	studentNamesList.add(4, "Scott");
	//Display elements from above list
		for(String studentName:studentNamesList){
			System.out.println(studentName);
		}
		
		
		System.out.println("################Removing an element 'Devi'from the list");
	//removing an element 'Devi' in the list
	studentNamesList.remove("Devi");
	for(String studentName:studentNamesList){
		System.out.println(studentName);
	}
	
	
	System.out.println("################Removing an element at 1st postion");
	studentNamesList.remove(1);
	//Display elements from above list
			for(String studentName:studentNamesList){
				System.out.println(studentName);
			}
	
			System.out.println("################Updating an element at 2nd postion");
	//set an element in desired position
	studentNamesList.set(2, "Maxwell");
	//Display elements from above list
	for(String studentName:studentNamesList){
		System.out.println(studentName);
	}
	
	
	System.out.println("################Adding an element at 5th postion");
	
	studentNamesList.add(4,"KCR");
	//Display elements from above list
		//for(int i=0;i<studentNamesList.size();i++){
		for(String studentName:studentNamesList){
			System.out.println(studentName);
		}
	
	
	}
	
	

}
