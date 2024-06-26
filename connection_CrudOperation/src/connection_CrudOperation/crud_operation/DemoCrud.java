package connection_CrudOperation.crud_operation;

public class DemoCrud {

	public static void main(String[] args) {
	
	PersonalInfo pi = new PersonalInfo();
	PersonalInfo pi1 = new PersonalInfo("adhar007","nilam","sss@nn.com","Pune");
	
	pi.setAdharno("adhar008");
	pi.setSname("Roopa");
	pi.setEmail("rrr@yahoo.co.in");
	pi.setAddr("Banglore");
	
	
		
		CrudOperations cr = new CrudOperations();
		
		
		CrudOperations.insertData(pi.getAdharno(),pi.getSname(),pi.getEmail(),pi.getAddr());
	
		CrudOperations.insertData(pi1.getAdharno(),pi1.getSname(),pi1.getEmail(),pi1.getAddr());		
		
        System.out.println(pi);
	//CrudOperations.insertData(pi);
		
		//	CrudOperations.deleteData("adhar05");
		
		
		CrudOperations.getData();
	}

}
