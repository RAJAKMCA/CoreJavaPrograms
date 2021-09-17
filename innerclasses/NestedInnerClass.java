package innerclasses;
//let us create Outer class
class Outer {
	// Create class as Inner
	class Inner {
		void showData() {
			System.out.println("Called inner class showData Method");
		}
	}
}
public class NestedInnerClass {
//Example for Nested inner class
	public static void main(String[] args) {
		
		Outer.Inner oi = new Outer().new Inner();
		oi.showData();
	}

}
