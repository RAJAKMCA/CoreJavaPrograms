package printpattern;

class PrintNumbers{
/*
<
<=
>
>=
!=
*/

static void printGivenNNumbers(int n){
for(int i=1;i<=n;i++){
	
	//System.out.println(i+" divide by "+i/2+" and reminder "+i%2);
	if(i%5==0){
	System.out.println(i);
	}
}

/*
int i=1;
while(i<=n){
	System.out.println(i);
	i++;
}
*/
}

public static void main(String[] argruments){
	//0 to (n-1) array size for n elemets
	int number=Integer.parseInt(argruments[0]);
	System.out.println("Hello I am demonstrating While Loop example");
    printGivenNNumbers(number);
}
}