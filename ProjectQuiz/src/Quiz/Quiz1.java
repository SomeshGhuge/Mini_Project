package Quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.random.*;
import java.util.*;

import java.util.Random;
public class Quetion {
	String Que;
	String Ans;

	public Quetion (String Que, String Ans){
		this.Que=Que;
		this.Ans=Ans;
	}
}


public class Quiz1 {
	
	
	    
	public void All() {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println(   "<-------This is the Java Knowledge Test-------------->\n"
		             	+"\n"
		            	+ "<-------Answer Should be ACCEPTED in Capital Form----> \n"
		             	+"\n"
		            	+ "<----------------(A , B , C ,D)---------------------->\n"
		             	+"\n<----------------Start The Test--------------------->");
	
	String q1="\n1) Select the packages in which JDBC classes are defined?\n"
			
			+ "[A] jdbc and javax.jdbc\n"
		 	+ "[B] rdb and javax.rdb\n"
			+ "[C] jdbc and java.jdbc.sql\n"
			+ "[D] java.sql and javax.sql\n";
	
	
    String q2="\n2) What are the major components of the JDBC?\n"
    		
    		+ "[A] DriverManager, Driver, Connection, Statement, and ResultSet\n"
    		+ "[B] DriverManager, Driver, Connection, and Statement\n"
    		+ "[C] DriverManager, Statement, and ResultSet\n"
    		+ "[D] DriverManager, Connection, Statement, and ResultSet\n";
    
    String q3="\n3) Thin driver is also known as?\n"
    		+ "[A] Type 3 Driver\n"
    		+ "[B] Type-2 Driver\n"
    		+ "[C] Type-4 Driver\n"
    		+ "[D] Type-1 Driver\n";
    
    String q4="\n4) Which of the following method is static and synchronized in JDBC API?\n"
    		
    		+ "[A] getConnection()\n"
    		+ "[B] prepareCall()\n"
    		+ "[C] executeUpdate()\n"
    		+ "[D] executeQuery()\n";
    
    
 String q5= "\n5) Parameterized queries can be executed by?\n"
 		
 		+ "[A] ParameterizedStatement\n"
 		+ "[B] PreparedStatement\n"
 		+ "[C] CallableStatement and Parameterized Statement\n"
 		+ "[D] All kinds of Statements\n";
 
 String q6= "\n6) How many transaction isolation levels provide the JDBC through the Connection interface?\n"
 	
		+ "[A] 3\n"
 		+ "[B] 4\n"
 		+ "[C] 7\n"
 		+ "[D] 2\n";
 
 
 String q7= "\n7) Which of the following method is used to perform DML statements in JDBC?\n"
 		
 		+ "[A] executeResult()\n"
 		+ "[B] executeQuery()\n"
 		+ "[C] executeUpdate()\n"
 		+ "[D] execute()\n";
		 
 String q8 = "\n8) Which of the following option leads to the portability and security of Java?\n"

          +"[A] Bytecode is executed by JVM \n"
          +"[B] The applet makes the Java code secure and portable\n "
          +"[C] Use of exception handling\n"
          +"[D] Dynamic binding between objects\n";
 
 
 String q9="\n9) The \u0021 article referred to as a \n "

			+"[A] Unicode escape sequence\n"
			+"[B] Octal escape\n"
			+"[C] Hexadecimal\n"
			+"[D] Line feed\n";

String q10="\n10) Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?\n"
		    + "[A] javap tool\r\n"
		    + "[B] javaw command\r\n"
	    	+ "[C] Javadoc tool\r\n"
	     	+ "[D] javah command\n";



Quetion []quetion= {
		
		

		new Quetion(q1,"D "),
		new Quetion(q2,"A "),
		new Quetion(q3,"C "),
		new Quetion(q4,"A"),
		new Quetion(q5,"B"),
		new Quetion(q6,"B"),
		new Quetion(q7,"C"),
		new Quetion(q8,"A"),
		new Quetion(q9,"A"),
		new Quetion(q10,"C"),
};


     TakeTest(quetion);
}
public void TakeTest(Quetion []quetion) {
	
	 try {
		 int score=0;
	
	Scanner scanner= new Scanner(System.in);
	for(int i=0;i<quetion.length;i++) {
	System.out.println(quetion[i].Que);
	
		String Answer=scanner.nextLine();
		
		if(Answer.equals(quetion[i].Ans)) {
			score++;
		}
	}

	if(score>=8 && score<=10) {
		System.out.println("Congratulation you got "+score+"/"+quetion.length+" and  your grade is----> A ");
	}else if(score>=6 && score<=8) {
		System.out.println("Congratulation you got "+score+"/"+quetion.length+" and  your grade is----> B ");

	}else if(score==5) {
		System.out.println("Congratulation you got "+score+"/"+quetion.length+" and  your grade is----> C ");

	}else {
		System.out.println("Congratulation you got "+score+"/"+quetion.length+"  Sorry you are Fail Candidate");
		}	
	
		 
	   System.out.println("<---------Insert data--------->");
	   System.out.println("Enter your Firstname");
	   String FirstName=scanner.next();
	   System.out.println("Enter your Lastname");
	   String LastName=scanner.next();
	   System.out.println("Enter your UserName");
	   String UserName=scanner.next();
	   System.out.println("Enter your Seat Number");
	   String Number=scanner.next();
	  
	 // loading driver
	   Class.forName("com.mysql.jdbc.Driver");
	   
	// establish connection
	
	   System.out.println("Enter your  MYSQL UserId");
	   String Userid=scanner.next();
	   System.out.println("Enter your MYSQL Password");
	   String Password=scanner.next();
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", Userid,Password);
	   
	// Prepare Statement
		PreparedStatement pre=con.prepareStatement("INSERT INTO user4 (FirstName,LastName,UserName,Number,Score) VALUES (?,?,?,?,?)");
		pre.setString(1, FirstName);
		pre.setString(2, LastName);
		pre.setString(3, UserName);
		pre.setString(4,Number);
		pre.setInt(5, score);
		
		int q = pre.executeUpdate();
		
 }catch(Exception e ) {
	 e.printStackTrace();
 }
  
}
	
	public static void main(String[]args) {
		char a;
		do{
			Scanner scan=new Scanner(System.in);
	        Quiz1 quiz = new Quiz1();
	        quiz.All();
	        
	    System.out.println("Do you want to do exam again --->If Yes Then Press Y or y");
	    a=scan.next().charAt(0);
		
		}while(a=='Y' ||a== 'y');
		System.out.println("<----- Thank u------>");	
}
}

