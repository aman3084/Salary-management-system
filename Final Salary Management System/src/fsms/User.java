package fsms;

import java.util.Scanner;

public class User {
	User(int a){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Updating your info");
		System.out.println("Enter 2 for Getting the pay slip");
		 int input = sc.nextInt();
		 if(input==1) {
			 
			 new UpdateEmployee(a);
			 
			 System.exit(0);
		}
		 if(input==2) {
			 new Pay_slip(a);
			 System.exit(0);
			 
		 }
	}
}


