package connection_CrudOperation.crud_operation;

public class PersonalInfo {
	
	private String adharno, sname ,email, addr;

	public PersonalInfo()
	{
		
	}
	public PersonalInfo(String adharno, String sname, String email, String addr) {
		 
		this.adharno = adharno;
		this.sname = sname;
		this.email = email;
		this.addr = addr;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
	
		CrudOperations.insertData(adharno, sname, email, addr);
		return "PersonalInfo [adharno=" + adharno + ", sname=" + sname + ", email=" + email + ", addr=" + addr + "]";
	} 
	
	

	
	
}
