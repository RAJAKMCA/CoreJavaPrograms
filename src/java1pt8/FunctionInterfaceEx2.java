package java1pt8;


@FunctionalInterface
interface FunctionalInterface2 {
	//A method with single parameter
    public int incrementByFive(int a);
}

//inside main method 

public class FunctionInterfaceEx2 {
   public static void main(String args[]) {
        // lambda expression with single parameter num
	   FunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.incrementByFive(25));
    }
}