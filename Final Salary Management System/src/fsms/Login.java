package fsms;

import java.sql.ResultSet;
import java.util.Scanner;
public class Login {
	
	
	Login(){
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		
		String name= new String();
		int password = sc.nextInt();
		int k = 0;
		try {
			Connect c1=new Connect();
			String q = "select * from login where username='"+username+"' and password='"+password+"'";
			String t = "select * from employee where username = '"+username+"'";
			ResultSet res1=c1.s.executeQuery(t);
			if(res1.next()) {
				k = res1.getInt("emp_id");
				name = res1.getString("FirstName");
				
			}
			ResultSet res=c1.s.executeQuery(q);
			if(res.next()){
				
					if(k==1) {
						System.out.println("Hey "+name+"(Admin)");
						new Admin();
						System.exit(0);
					}
					else if(k!=1) {
						System.out.println("Hey "+ name);
						new User(k);
						System.exit(0);
					} 
				}
				
			
			else {
                	System.out.println("Invalid Credentials");
                }
                	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Employee username and password");
		new Login();
	}

}
