package serilization;


//Java program to illustrate Cloneable interface
import java.lang.Cloneable;

//By implementing Cloneable interface
//we make sure that instances of class A
//can be cloned.
class Company implements Cloneable
{
 int code;
 String name;

 // A class constructor
 public Company(int code,String name)
 {
     this.code = code;
     this.name = name;
 }

 // Overriding clone() method
 // by simply calling Object class
 // clone() method.
 @Override
 protected Object clone()
 throws CloneNotSupportedException
 {
     return super.clone();
 }
}

public class CloneExample
{
 public static void main(String[] args)
     throws CloneNotSupportedException
 {
     Company a = new Company(1011, "AlphaSystems");

     // cloning 'Company' and holding
     // new cloned object reference in b

     // down-casting as clone() return type is Object
     Company b = (Company)a.clone();
     

     System.out.println(b.code);
     System.out.println(b.name);
 }
}


