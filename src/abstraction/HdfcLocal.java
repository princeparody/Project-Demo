package abstraction;

public class HdfcLocal extends HDFCMain  {

	@Override
	public void savingAccount() {
		
		System.out.println("7%");
	}

	@Override
	public void fixedAccount() {
		
		System.out.println("8%");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("9%");
		
		
	}
	
	public static void main(String[] args) {
		HdfcLocal i = new HdfcLocal();
		i.savingAccount();
		i.fixedAccount();
		i.currentAccount();
		
	}

}
