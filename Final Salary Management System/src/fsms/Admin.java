package fsms;

import java.util.Scanner;


public class Admin {
	Admin(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to Salary Management System");
		System.out.println("Enter 1 for Adding new Employee Details");
		System.out.println("Enter 2 for Getting the Pay slip");
		System.out.println("Enter 3 for Getting the List of Employees");
		System.out.println("Enter 4 for Updating Info of an Employees");
		
		
		 int input = sc.nextInt();
		 if(input==1) {
			 new NewEmployee();
				System.exit(0);
			 
		 }
		 if(input==2) {
			 new Pay_slip();
				System.exit(0);
			 
		 }
		 if(input==3) {
			 new List();
			  System.exit(0);
		 }
		 if(input==4) {
			 new UpdateEmployee();
			  System.exit(0);
		 }
		 
}
	

}
