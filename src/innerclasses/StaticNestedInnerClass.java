package innerclasses;

class OuterStatic {
	// Create class as Inner
	static class Inner {
		public void showData() {
			System.out.println("Static Inner CLass Method Caled");
		}
	}
}

public class StaticNestedInnerClass {

	public static void main(String[] args) {
		OuterStatic.Inner os = new OuterStatic.Inner();
		os.showData();

	}
}
