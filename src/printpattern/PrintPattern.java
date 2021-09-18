package printpattern;

class PrintPattern{
	
static void printPattern1(int n){
/*
*
**
***
****
*****
......
*/	 
for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print('*');//since * is single character we can keep it inside single quotes
	}
	System.out.println();
}	
}
	
	
static void printPattern2(int n){
	
/*
Print pattern like this and replace ("-") with (" ") once it is printed as you desired
---------*
--------**
-------***
------****
-----*****
----******
---*******
--********
-*********
**********
*/
   
   
for(int i=n;i>=1;i--){
  //Parent loop 1st iteration i=5,5>=1 true
 //Parent loop 2nd iteration i=4,4>=1 true
 //Parent loop 3rd iteration i=3,3>=1 true
	   for(int j=i;j>1;j--){
		//print below space j times	until it reaches expression 1>1(false)
		//means if j=5 then print 4 spaces in first iteration
		//System.out.print("-");
		  System.out.print(" ");
		}
		for(int k=1;k<=n-i+1;k++){ 
		   System.out.print("*");
		}
		   System.out.println();
	}	
	
}

static void printPattern3(int n){
/*
   *
  ***
 *****
*******
*/
    
int l=1;//initilize how many extra stars required on each row
for(int i=n;i>=1;i--){
 //Parent loop 1st iteration i=5,5>=1 true
 //Parent loop 2nd iteration i=4,4>=1 true
 //Parent loop 3rd iteration i=3,3>=1 true
		for(int j=i;j>1;j--){
		//print below space j times	until it reaches expression 1>1(false)
		//means if j=5 then print 4 spaces in first iteration
		//System.out.print("-");
		System.out.print(" ");
		}
		for(int k=1;k<=n-i+l;k++){ 
		//print below star k times until it reachs above expression means 5-5+1=1,then 1<=1(true)
		//means in first iteration only one start will print in same above row
		
		//1st iteration 5-5+1=1
		//2nd iteration 5-4+2=3
		//3rd iteration 5-3+3=5....
			System.out.print("*");
		}
		//Move curser for next row
		System.out.println();
		l=l+1;// increment counter for print extra stars in each row
	}
}	

static void printPattern4(int n){
/*
   *
  ***
 *****
*******
*/
    
int l=1;//initilize how many extra stars required on each row
for(int i=n;i>=1;i--){
 //Parent loop 1st iteration i=5,5>=1 true
 //Parent loop 2nd iteration i=4,4>=1 true
 //Parent loop 3rd iteration i=3,3>=1 true
		for(int j=i;j>1;j--){
		//print below space j times	until it reaches expression 1>1(false)
		//means if j=5 then print 4 spaces in first iteration
		//System.out.print("-");
		System.out.print(" ");
		}
		for(int k=1;k<=n-i+l;k++){ 
		//print below star k times until it reachs above expression means 5-5+1=1,then 1<=1(true)
		//means in first iteration only one start will print in same above row
		
		//1st iteration 5-5+1=1
		//2nd iteration 5-4+2=3
		//3rd iteration 5-3+3=5....
			System.out.print("*");
		}
		//Move curser for next row
		System.out.println();
		l=l+1;// increment counter for print extra stars in each row
	}
	
//l=l/2;//initilize how many extra stars required on each row
l=l-1;
int n2=n-1;
for(int i=1;i<=n2;i++){
 //Parent loop 1st iteration i=5,5>=1 true
 //Parent loop 2nd iteration i=4,4>=1 true
 //Parent loop 3rd iteration i=3,3>=1 true
		for(int j=1;j<=i;j++){
		//print below space j times	until it reaches expression 1>1(false)
		//means if j=5 then print 4 spaces in first iteration
		//System.out.print("-");
		System.out.print(" ");
		}
		for(int k=n2-i+l;k>1;k--){ 
		//print below star k times until it reachs above expression means 4-1+4=7,then 7>1(true)
		//means in first iteration four stars will print in same above row
		
		//1st iteration 4-1+4=7
		//2nd iteration 4-2+3=5
		//3rd iteration 4-3+2=3
		//4th iteration 4-4+1=1
			System.out.print("*");
		}
		//Move curser for next row
		System.out.println();
		l=l-1;// increment counter for print extra stars in each row
	}
}
	
	
	
	public static void main(String[] args){
		System.out.println("printPattern 1 @@@@@@");
		printPattern1(Integer.parseInt(args[0]));
		System.out.println("printPattern 2 @@@@@@");
		printPattern2(Integer.parseInt(args[0]));
		System.out.println("printPattern 3 @@@@@@");
		printPattern3(Integer.parseInt(args[0]));
		System.out.println("printPattern 4 @@@@@@");
		printPattern4(Integer.parseInt(args[0]));
	}


}