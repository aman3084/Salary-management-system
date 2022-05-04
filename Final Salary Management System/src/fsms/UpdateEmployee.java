package fsms;

import java.util.*;




public class UpdateEmployee {
	UpdateEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for update OR Enter 2 for delete");
		int k = sc.nextInt();
		if(k==1) {
		System.out.println("Enter details in following order->first name->Last name->sex->username->mobile no->emp_id");
		System.out.println("Note:: You cannot change your username");
		
		String name = sc.next();
		String last = sc.next();
		String sex= sc.next();
		String username = sc.next();;
		String mobile = sc.next();
		int id = sc.nextInt();
		
		String qry = "update employee set FirstName='"+name+"',LastName='"+last+"',sex='"+sex+"',username='"+username+"',mobile ='"+mobile+"' where emp_id='"+id+"'";
	    
	    try{
	        Connect c1 = new Connect();
	        c1.s.executeUpdate(qry);
	        System.out.println("Employee Updated");
	    }catch(Exception ee){
	        ee.printStackTrace();
	        System.out.println("Enter in valid order");
	    }
		}
		else if(k==2){
	    try{
	    	System.out.println("Enter employee_id you want to delete");
	    	int id = sc.nextInt();
	        Connect c1 = new Connect();
	        c1.s.executeUpdate("delete from employee where emp_id='"+id+"'");
	        System.out.println("Employee Deleted");
	    }catch(Exception ee){
	        ee.printStackTrace();
	    }
		}else {
			System.out.println("INVAlID Input");
		}
	}
	UpdateEmployee(int n){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for update OR Enter 2 for delete");
		int k = sc.nextInt();
		if(k==1) {
		System.out.println("Enter details in following order->first name->Last name->sex->->mobile no.");
		String name = sc.next();
		String last = sc.next();
		String sex= sc.next();
		String mobile = sc.next();
		int id = n;
		
		
	    String qry = "update employee set FirstName='"+name+"',LastName='"+last+"',sex='"+sex+"',mobile ='"+mobile+"' where emp_id='"+id+"'";
	    try{
	        Connect c1 = new Connect();
	        c1.s.executeUpdate(qry);
	        System.out.println("Employee Updated");
	    }catch(Exception ee){
	        ee.printStackTrace();
	        System.out.println("Enter in valid order");
	    }
		}
		else if(k==2){
	    try{
	    	System.out.println("Enter employee_id you want to delete");
	    	int id = sc.nextInt();
	        Connect c1 = new Connect();
	        c1.s.executeUpdate("delete from employee where emp_id='"+id+"'");
	        System.out.println("Employee Deleted");
	    }catch(Exception ee){
	        ee.printStackTrace();
	    }
		}else {
			System.out.println("INVAlID Input");
		}
	}
	
}
