package innerclasses;
//Anonymous inner class
abstract class Animal {
	abstract void showAnimalName();
}
class AnimalClass extends Animal  {
	 void showAnimalName() {
		 System.out.println("It is Dog Animal");
	}
}

public class AnonymasInnerClass {
	public static void main(String[] args) {
		/*
		System.out.println("Anonymous Inner Class Exampel!!!");
		Animal a1 = new Animal() {
			void showAnimalName() {
				System.out.println("It is Dog Animal");
			}
		};
		a1.showAnimalName();
		*/
		Animal a1=new  AnimalClass();
		 a1.showAnimalName();
	}
}
/* Normal way of implmentation without anonymous inner block
 *Animal a1=new  AnimalClass();
 *a1.showAnimalName();
 * 
 */


/*
  Using lambda expression
Animal a2 =()->{
System.out.println( "It is Dog Animal");
};
a2.showAnimalName();
*/