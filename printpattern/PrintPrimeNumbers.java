package printpattern;

class PrintPrimeNumbers{
	//if a number is divisiable by 1 and itself are prime numbers
	 static void printNPrimeNumbers(int n){
		//1,3,7,11,17,23....
		for(int i=1;i<=n;i++){
			//iterate each number either number is prime or not
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){//if it is divisiable 1 to jth number then increment counter 
					count++;
				}
			}
			if(count==2){// As per logic mostly it should only two diviers then print that number
			System.out.println(i);
			count=0;//re initilize counter with zero for next iteration
			}
		}	
	}
	public static void main(String[] args){
		printNPrimeNumbers(Integer.parseInt(args[0]));
	}
}