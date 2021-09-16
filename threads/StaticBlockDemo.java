package threads;

public class StaticBlockDemo {

	static  {
		System.out.println("Calling a static block");
	}
    static void staticMethod(){
    	System.out.println("Called static Method");
    }
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling Main method");
	}*/

}
