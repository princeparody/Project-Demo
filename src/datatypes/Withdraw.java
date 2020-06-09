package datatypes;

import java.util.Scanner;

public class Withdraw {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	System.out.println("enter your ATM pin");
	int mypin = scan.nextInt();
	
	System.out.println("enter your registered mobile no");
	long mymobileno = scan.nextLong();
	
	System.out.println("select your transaction");
	String mytrans = scan.next();
	
	System.out.println("select withdraw Amount");
	float myamount = scan.nextFloat();
	
	
	
	
	}

}
