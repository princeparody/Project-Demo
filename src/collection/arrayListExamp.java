package collection;

import java.util.ArrayList;
import java.util.List;

public class arrayListExamp {
	
	public static void main(String[] args) {
	
	List <String> eg1 = new ArrayList<String>();

	eg1.add("Audi");
	eg1.add("Benz");
	eg1.add("Ford");
	eg1.add("Ford");
	eg1.add("Suzuki");
	eg1.add("Toyota");
	eg1.add("Nexa");
	
	System.out.println(eg1);
	
	List <String> eg2 = new ArrayList<String>();
	
	eg2.add("Audi");
	eg2.add("Benz");
	eg2.add("Ford");
	eg2.add("Ford");
	eg2.add("Suzuki");
	eg2.add("Toyota");
	eg2.add("Kia");
	
	System.out.println(eg2);
	
	eg1.retainAll(eg2);
	
	System.out.println(eg1);
	}
	
	}


