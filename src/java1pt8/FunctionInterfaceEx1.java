package java1pt8;

@FunctionalInterface
//A functional interface is added
interface MyFunctionalInterface {
	// A method with no parameter
	public String sayHello();
}

public class FunctionInterfaceEx1 {
	public static void main(String args[]) {
		// Here use lambda expression to replace anonymus inner class
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}