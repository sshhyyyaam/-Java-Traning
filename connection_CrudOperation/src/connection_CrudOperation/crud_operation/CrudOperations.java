package connection_CrudOperation.crud_operation;
import java.sql.*;
import javax.sql.*;

import connection_CrudOperation.connection.MakeConnection;
public class CrudOperations {
	
   static	Statement st;
   static	Connection cn;
	
	public 	CrudOperations(){
	cn = MakeConnection.getConnection();	
	try {
		st = cn.createStatement();
	} catch (SQLException e) {
		 
		e.printStackTrace();
	}  
	//it will create empty statement
	}
	
	public static void insertData(String adhar,String name,String email,String addr) {
	
String squery = "insert into personalinfo values('"+ adhar + "','" + name +"','" + email + "','" + addr +"')";
System.out.println(squery);
		try {
			int r = st.executeUpdate(squery);
			System.out.println(r);
			if(r>0) {
				System.out.println("REcord inserted .....");
			}
			 //execute the query[insert,update and delete
			
		} 
		catch(SQLIntegrityConstraintViolationException sq) {
			System.out.println("can not duplicate adhar number value");
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}  
	   
		
		
	}
	public static void updateData() {
		
	}
	public static void deleteData(String adhar) {
	
		String sq = "delete from personalinfo  where adharno='"+adhar+ "'";
		try {
			int k = st.executeUpdate(sq);
			if(k>0) {
				System.out.println("Record Deleted");
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
}
	
	
	public static void getData() {
		String sq = "select * from personalinfo";
		try {
		 ResultSet r =	st.executeQuery(sq);
			//it will return records
		 
		 while(r.next()) {
			 
		System.out.println(r.getString(1)+ "  "+ r.getString(2) + "  " + r.getString(3) + "  " + r.getString(4));	 
			 
		 }
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
