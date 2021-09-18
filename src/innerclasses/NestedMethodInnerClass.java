package innerclasses;

public class NestedMethodInnerClass {
	// For inner class you can create object inside outer method only
	public void outerMethod() {
		class InnerClass {
			void display() {
				System.out.println("DIsplay Method called From Inner CLass");
			}
		}
		// creating an object for innerclass
		InnerClass in = new InnerClass();
		in.display();
	}

	public static void main(String[] args) {
		NestedMethodInnerClass nmi = new NestedMethodInnerClass();
		nmi.outerMethod();
	}

}
