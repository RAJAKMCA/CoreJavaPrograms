package collections;

import java.util.HashMap;

import pojoclasses.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,Student> studentHashMap =new HashMap<Integer,Student>();
    
    Student st1=new Student(101,"Ravi","Hyd");
    studentHashMap.put(st1.getId(), st1);
    Student st2=new Student(1011,"Scott","Mumbai");
    studentHashMap.put(st2.getId(), st2);

    Student st3=new Student(1021,"Renu","Delhi");
    
    studentHashMap.put(st3.getId(), st3);
    
    System.out.println("print elements in the HashMap:"+studentHashMap);/*
    {1011=Student [id=1011, name=Scott, address=Mumbai], 101=Student [id=101, name=Renu, address=Delhi]}
	}*/
    //get by Key
    studentHashMap.get(1011);
    
    //getValue
    System.out.println("1011 exists:"+studentHashMap.containsKey(1011));
    
    System.out.println("Ravi exists:"+studentHashMap.containsValue("Ravi"));
    
    //get all keySet from the hashMap
    System.out.println("Key Set:"+studentHashMap.keySet());
   // get all the keys from the HashMap
	}
	
	//synchonized class
	//fail-fast
	//initial capacity is 16
	//load facter 0.75
    

}
