package innerclasses;
//Anonymous inner class
abstract class Animal {
	abstract void showAnimalName();
}

public class AnonymasInnerClass {
	public static void main(String[] args) {
		System.out.println("Anonymous Inner Class Exampel!!!");
		Animal a1 = new Animal() {
			void showAnimalName() {
				System.out.println("It is Dog Animal");
			}
		};
		a1.showAnimalName();
	}
}
