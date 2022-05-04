package fsms;

import java.util.Scanner;

public class NewEmployee {
	NewEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details for new employee(emp_id , name)");
		int id = sc.nextInt();
		String name = sc.nextLine();
		String sur = sc.nextLine();
		String sex = sc.nextLine();
		String userid = sc.nextLine();
		String mobile = sc.nextLine();
		String qry = "insert into employee values('"+id+"','"+name+"','"+sur+"','"+sex+"','"+userid+"','"+mobile+"')";
		try{
            Connect c1 = new Connect();
            c1.s.executeUpdate(qry);
            System.out.println("Employee Added"); 
        }catch(Exception ee){
            ee.printStackTrace();
        }
	}

}
