package serilization;

// Java program to illustrate Serializable interface
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
  
// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
class Employee implements Serializable
{
 /**
	 * 
	 */
private static final long serialVersionUID = 1L;

int code;
 String name;
 transient double salary;
 
    // Employee class constructor
    public Employee(int code,String name,double salary)
 {
     this.code = code;
     this.name = name;
	 this.salary=salary;
 }
}
  
public class SerializableExample
{
    public static void main(String[] args)
      throws IOException, ClassNotFoundException
    {
        Employee employee1 = new Employee(1011, "Raja",10000);
        // Serializing 'employee1'
        FileOutputStream fos = new FileOutputStream("saveStudents.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee1);
  
        // De-serializing 'employee1' 
        FileInputStream fis = new FileInputStream("saveStudents.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee2 = (Employee)ois.readObject();//down-casting object
       
        System.out.println(employee2.code+" "+employee2.name+" "+employee2.salary);
 
        // closing streams
        oos.close();
        ois.close();
    }
}
