package fsms;

import java.sql.ResultSet;
import java.util.Scanner;
import java.util.*;

public class Pay_slip {
	Pay_slip(){
		try{
			Scanner sc =new Scanner(System.in);
	        Connect c = new Connect();
	        System.out.println("Enter the employee id for the pay_slip");
	        int id = sc.nextInt();
	        ResultSet rs = c.s.executeQuery("select * from employee where emp_id="+id);
	        rs.next();
	        String name = rs.getString("FirstName");
	        rs.close();
	     
	        rs = c.s.executeQuery("select * from salary where emp_id="+id);

	        java.util.Date date= new Date();
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        int month = cal.get(Calendar.MONTH);
	        System.out.println(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2022  ------------------------");
	        System.out.println("\n");

	        if(rs.next()){
	      
	            System.out.println("\n    Employee ID "+id);
	            System.out.println("\n     Employee Name "+name);

	            System.out.println("\n----------------------------------------------------------------");
	            System.out.println("\n");

	            double basic = rs.getDouble("basic");
	            System.out.println("\n                  monthly        : "+basic);
	            double rent  = rs.getDouble("rent_allow");
	            System.out.println("\n                 rent allowance          : "+rent);
	            double special  = rs.getDouble("spec_allow");
	            System.out.println("\n             	  net          : "+special);
	            double monthly = rs.getDouble("total_monthly");
	            System.out.println("\n                  Monthly         : "+monthly);
	            double net = rs.getDouble("net");
	            System.out.println("\n                  BASIC SALARY : "+net);
	            double gross = rs.getDouble("gross");
	            System.out.println("\n                  BASIC SALARY : "+gross);

	            System.out.println("\n-------------------------------------------------------");
	            System.out.println("\n");

	            System.out.println("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);
	            System.out.println("\n       Tax   :   2.1% of gross "+ (gross*2.1/100));   
	            System.out.println("\n -------------------------------------------------");
	            System.out.println("\n");
	            System.out.println("\n");    
	            System.out.println("\n");
	            System.out.println("   (  Signature  )      ");

	        }
	    }catch(Exception ee) {
	        ee.printStackTrace();
	    }
	
	}		
	Pay_slip(int id){
		try{
        Connect c = new Connect();
        //System.out.println("Enter the employee id for the pay_slip");
     
        ResultSet rs = c.s.executeQuery("select * from employee where emp_id="+id);
        rs.next();
        String name = rs.getString("FirstName");
        rs.close();
     
        rs = c.s.executeQuery("select * from salary where emp_id="+id);

        Date d1 = new java.util.Date();
        int month = d1.getMonth();
        System.out.println(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2022  ------------------------");
        System.out.println("\n");

        if(rs.next()){
      
            System.out.println("\n    Employee ID "+id);
            System.out.println("\n     Employee Name "+name);

            System.out.println("\n----------------------------------------------------------------");
            System.out.println("\n");

            double basic = rs.getDouble("basic");
            System.out.println("\n                  basic        : "+basic);
            double rent  = rs.getDouble("rent_allow");
            System.out.println("\n                 rent allowance  : "+rent);
            double special  = rs.getDouble("spec_allow");
            System.out.println("\n             	  net          : "+special);
            double monthly = rs.getDouble("total_monthly");
            System.out.println("\n                  Monthly         : "+monthly);
            double net = rs.getDouble("net");
           // System.out.println("\n                  net salary : "+net);
            double gross = rs.getDouble("gross");
           // System.out.println("\n                  gross salary : "+gross);

            System.out.println("\n-------------------------------------------------------");

            System.out.println("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);  
            System.out.println("\n -------------------------------------------------");
            System.out.println("\n");
            System.out.println("\n");    
            System.out.println("\n");
            System.out.println("   (  Signature  )      ");

        }
    }catch(Exception ee) {
        ee.printStackTrace();
    }
}
}
