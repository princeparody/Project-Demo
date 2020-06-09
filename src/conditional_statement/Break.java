package conditional_statement;

public class Break {

	public static void main(String[] args) {
		
		for (int i=0; i<6; i++) {
			
			if(i==3) {
				 System.exit(0);
			}
		System.out.println(i);
		}
		
		System.out.println("END");
	}
}
