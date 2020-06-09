package demo;

public class PrinceJava {
Long accountNumber=12345678901l;

String holderName= "Boss";

Integer accountBalance=500;

public void getBalance() {
	System.out.println("My Balance is "+ accountBalance);
}
public void holderName() {
	System.out.println("My Holder Name is "+ holderName);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrinceJava account = new PrinceJava();
account.getBalance();
account.holderName();
	}

}
