package datatypes;

public class WorkersDetails {
	
	public void wrkOne() {
		
		int id = 987890;
		String name = "partha";
		long mbno = 9087695432l;
		float sal = 20000;
		char gender ='M';
		String mailid = "partha@gmail.com";
		Boolean status = true;
		
		System.out.println("wrk id is : "+id);
		System.out.println("wrk name is : "+name);
		System.out.println("wrk mbno is : "+mbno);
		System.out.println("wrk sal is :"+sal);
		System.out.println("wrk gender is :"+gender);
		System.out.println("wrk mailid is :"+mailid);
		System.out.println("wrk status ia :"+status);
		

	}
	
	public static void main(String[] args) {
		WorkersDetails wrk = new WorkersDetails();
		wrk.wrkOne();
	}




}
