package conditional_statement;

public class Switch {
	
	public static void main(String[] args) {
		
		String s = "Red";
		
		switch (s) {
		case "Red":
			System.out.println("STOP");
			break;
			
		case "Yellow":
			System.out.println("GET READY");
			break;
			
		case "Green":
			System.out.println("GO");
			break;
			
			default :
				System.out.println("Error");
				break;
		}
	}

}
