package innerclasses;

import java.util.ArrayList;

public class LamdaCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hyd");
		a1.add("BZa");
		a1.add("Pune");
		a1.add("Mumbai");
		for(String cityName:a1){
			System.out.println("cityName:"+cityName);
		}
		a1.forEach(
				(cityNames)->System.out.println(cityNames)
				);
		
	}

}
