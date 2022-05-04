package fsms;

import java.sql.ResultSet;
import java.util.Arrays;

public class List {
	List(){
		String d[][]=new String[5][5];  
	    int i=0;
	    int j = 0;
		try{
			String q="select * from employee";
			Connect c1=new Connect();
			ResultSet rs = c1.s.executeQuery(q);
			 while(rs.next()){
	                // i = 0 j = 0
	                d[i][j++]=rs.getString("emp_id");
	                d[i][j++]=rs.getString("FirstName");
	                d[i][j++]=rs.getString("LastName");
	                d[i][j++]=rs.getString("sex");
	                d[i][j++]=rs.getString("username");
	                d[i][j++]=rs.getString("Mobile");
	                i++;
	                j=0;
	            }
			 System.out.println(Arrays.deepToString(d));
		}catch(Exception e) {}
	}
}
