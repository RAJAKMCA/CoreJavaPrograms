package java1pt8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaWithSort {


	   public static void main(String args[]) {
	   
	      ArrayList<String> a1=new ArrayList<String>();
			a1.add("Hyd");
			a1.add("BZa");
			a1.add("Vizag");
			a1.add("Pune");
			a1.add("Mumbai");
			
	      ArrayList<String> a2=new ArrayList<String>();
			a2.add("Hyd");
			a2.add("BZa");
			a2.add("Vizag");
			a2.add("Pune");
			a2.add("Mumbai");
			
			 System.out.println("@@Before Sort: "+a1);
			 
		 LamdaWithSort sorting = new LamdaWithSort();
		 
	      System.out.println("Sort using Java 7 syntax: ");
	      sorting.sortUsingJava7(a1);
	      System.out.println(a1);
	      
	      System.out.println("Sort using Java 8 syntax: ");
	      sorting.sortUsingJava8(a2);
	      System.out.println(a2);
	   }
	   
	   //sort using java before 7
	   private void sortUsingJava7(List<String> names) {   
		   //Sorting using Comparator class implementation with anonymous inner class
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names) {
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
	}