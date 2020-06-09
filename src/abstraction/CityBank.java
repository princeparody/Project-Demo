package abstraction;

public class CityBank implements CentralBank, unionBank  {

	@Override
	public void currencyRate() {
		
		System.out.println("11%");
		
	}

	@Override
	public void educationLoan() {
		
		System.out.println("12%");
		
	}

	@Override
	public void housingLoan() {
		
		System.out.println("13%");
		
	}
	
	public static void main(String[] args) {
		
		CityBank c = new CityBank();
		c.currencyRate();
		c.educationLoan();
		c.housingLoan();
				
		
	}

	@Override
	public void medicalLoan() {
		System.out.println("14%");
		
	}

	@Override
	public void businessLoan() {
		System.out.println("15%");
		
	}

}
