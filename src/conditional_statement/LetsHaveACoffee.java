package conditional_statement;

public class LetsHaveACoffee {
	
	//data type boolean -true,false
	
	boolean isCupEmpty=true;

	public static void main(String[] args) {
		
		LetsHaveACoffee a= new LetsHaveACoffee();
		
		if (a.isCupEmpty){
	
			System.out.println("Fill the cup");
	} 
		else {
			
			System.out.println("Have the coffee");
			
		}
	}

