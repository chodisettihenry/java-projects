package librarymanagement.com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		Statement st = null;
		Connection con = null;
		ResultSet rs;
		
		
		// try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//String Query="select * from college";
		String url="jdbc:mysql://localhost:3306/library";
		String userName="root";
		String password="Mathewhenry256@";
		 con=DriverManager.getConnection(url, userName, password);
		 st=con.createStatement();
		 //libraryBook tables....
//		String createTableQuery = "create table libraryBooks(RowNo int unique,BookName varchar(20),author varchar(10),Price double)";
//		st.executeUpdate(createTableQuery);
//		System.out.println("Table created successfully.");
		
		//userSide table
//		String createTableQuery2 = "create table UserSide(SNo int unique,UserName varchar(20),DateofBorrowing Date,ValidDate int,DateOfReturn Date,PaidAmount double,BalanceAmount double,PhoneNumber int)";
//		st.executeUpdate(createTableQuery2);
//		System.out.println("Table2 created successfully.");
		
		//inserting into data on libraryBooks
//		 String datainsertingLibrartbook="insert into libraryBooks (RowNo,BookName,author,Price) values(1,'Networking','charwles',199.0),(2,'Arithmetic','RsBabu',256.00),(3,'Developing','Nelayya',99.00),(4,'Management','Mathew',599.00),(5,'WorldBook','Mahesh',388.00)";
//		 st.executeUpdate(datainsertingLibrartbook);
//		 System.out.println("Data iS inserted in LibraryBook Table is sucessfully done.");
		 
		 //showing the data from libraryBooks
//		 String DisplayLibraryData ="select * from librarybooks";
//		 rs= st.executeQuery(DisplayLibraryData);
//		
//		 System.out.println("RowNO  BookName    author    Price");
//		 while(rs.next()) {
//			
//			 int RowNo = rs.getInt(1);
//			 String BookName = rs.getString(2);
//			 String author = rs.getString(3);
//			 double Price = rs.getDouble(4);
//			 
//			 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
//			 
//		 }
		 String sql="INSERT INTO userside(SNo,UserName,DateofBorrowing,ValidDate,DateOfReturn,PaidAmount,BalanceAmount,phoneNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		 
		 PreparedStatement preparedStatement = con.prepareStatement(sql);
		 
		 boolean condition1 = true;
		 boolean condition2 = true;
		 boolean condition3 = true;
		 boolean condition4 = true;
		 boolean condition5 = true;
		 
		
		
		 System.out.print("Create your LoginId: ");
			String Loginid = input.nextLine();
			System.out.println();
			System.out.print("Create your password: ");
			 String pas = input.nextLine();
			 System.out.println();
			 System.out.println("Register is successfull. Go TO Login credentials.");
			 while(true) {
			 System.out.println("Enter your Login credentials");
			
			 System.out.println();
			System.out.print("Enter your loginid: ");
			
			String Inputloginid = input.nextLine();
			System.out.println();
			System.out.print("Enter your password: ");
			String Inputpassword = input.nextLine();
			System.out.println();
			if((Loginid.equals(Inputloginid))&&(pas.equals(Inputpassword))) {
			
				System.out.println("Successfully logined...");
				System.out.println("Welcome to Mylibrary");
				System.out.println();
				System.out.println("Avaliable Books in MyLibrary..");
				String DisplayLibraryBooks ="select * from librarybooks";
				 rs= st.executeQuery(DisplayLibraryBooks);
				
				 System.out.println("RowNO   BookName     Price");
				 while(rs.next()) {
					
					 int RowNo = rs.getInt(1);
					 String BookName = rs.getString(2);
					 String author = rs.getString(3);
					 double Price = rs.getDouble(4);
					 
					 System.out.println(RowNo+"     "+BookName+"   "+Price);
					 
				 }
				 System.out.println();
				 System.out.print("Enter Your Good Name:");
				 String GoodName = input.next();
				 System.out.println("Hello "+GoodName+" Welcome to Mylibrary..");
				 System.out.println();
				 System.out.print("Enter your phone Number: ");
				 String phonenumber = input.next();
				 int i=1;
				 preparedStatement.setInt(1, i);
				 preparedStatement.setString(2, GoodName);
				 preparedStatement.setString(8, phonenumber);
				 i++;
				 
				 
				 System.out.println("Thank you "+GoodName+" for visiting our Mylibrary. ");
				 System.out.println();
				while(true) {
				 System.out.println("Select a Avaliable book.");
				 System.out.println("1.Netwoking");
				 System.out.println("2.Arithmetic");
				 System.out.println("3.Developing");
				 System.out.println("4.Management");
				 System.out.println("5.WorldBook");
				 System.out.println("6.Exit from Mylibrary");
				 System.out.print("Enter your choice 1,2,3,4,5,6 :");
				 int inputBook = input.nextInt();
				 switch(inputBook) {
				 case 1:
					 
					 while(condition1) {
					    System.out.println("1.Details");
				        System.out.println("2.Borrowing");
				        System.out.println("3.Returning");
				        System.out.println("4.Exit");
				        System.out.print("Enter your choice: ");
				        int choiceAvaliablebook = input.nextInt();
				        double balance=0;
				        double balancecheck = balance;
				        switch(choiceAvaliablebook) {
				        case 1:System.out.println("Detalis of book");
					       String DisplayLibraryBookNetworking ="select * from librarybooks where RowNo = 1";
					       rs= st.executeQuery(DisplayLibraryBookNetworking);
							 System.out.println("RowNO  BookName    author    Price");
							 while(rs.next()) {
								
								 int RowNo = rs.getInt(1);
								 String BookName = rs.getString(2);
								 String author = rs.getString(3);
								 double Price = rs.getDouble(4);
								 
								 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
								 
								 
							 }
							 break;
				        case 2: System.out.println("Select a Avalible to borrow.");
				                System.out.print("Enter your borrow book name:");
				                String borrowBook = input.next();
				                String DisplayLibraryBookNetworkingMoney ="select Price from librarybooks where RowNo = 1";
							       rs= st.executeQuery(DisplayLibraryBookNetworkingMoney);
							       double Price =0;
							       double amountpaid=0;
									 if(rs.next()) {
										  Price = rs.getDouble(1);
										 
										 
										 System.out.println(" Book Amount is  "+Price);
									 
										 System.out.print("Enter Amount to borrow a book: ");
										 int amount= input.nextInt();
										  amountpaid=(int)amount;
										 if(amountpaid==Price) {
											 System.out.println("Thankyou borrowed a book.");
											 
										 
										 
									 }
										 else {
											  balance = Price-amountpaid;
											 System.out.println("Your Total balance to borrow a  book is "+balance);
										 }
									 }
										
										 System.out.print("Enter a date (YYYY-MM-DD): ");
										 String borrowdate= input.next();
									//	 LocalDate inputDate = LocalDate.parse(borrowdate);
										 System.out.println();
										 System.out.print("Enter Number. How Many days do you need a book: ");
										 int validdate = input.nextInt();
										 System.out.println();
										 System.out.print("When you return a book to Mylibrary.Enter a exact date (YYYY-MM-DD): ");
										 String Dateofreturn = input.next();
										 preparedStatement.setString(3, borrowdate);
										 preparedStatement.setInt(4, validdate);
										 preparedStatement.setString(5, Dateofreturn);
										 preparedStatement.setDouble(6, amountpaid);
										 preparedStatement.setDouble(7, balance);
										 int rowsAffected = preparedStatement.executeUpdate();

										 
										 
										 break;
										 
				        case 3:
				        	 String DisplayLibraryBookNetworkingMoneybalance ="select BalanceAmount from userside where SNo=1";
						       rs= st.executeQuery(DisplayLibraryBookNetworkingMoneybalance);
						       double balancechecking =0;
								 if(rs.next()) {
									  balancechecking = rs.getDouble(1);
									  System.out.print("Enter your Book Name to return: ");
							        	String returnBook= input.next();
							        	if(balancechecking == 0) {
							        		System.out.println("Great Job. Thanks for visiting mylibrary..");
							        	}
							        	else {
							        		System.out.println("You have balance amount is "+balancechecking+" to pay.");
							        		System.out.print("pay your Balance: ");
							        		double paybalance = input.nextDouble();
							        		if(paybalance==balancechecking) {
							        			System.out.println("Great job. Thanking you for paying balance amount...");
							        		}else {
							        			
								                System.out.print("Pay your balance amount:");
								                String balancepay = input.next();
							        		}
							        	}
									 
									 
								 }
				        	
				        	
				        	
				        	
				        	
				        	
				        	break;
				        case 4:System.out.println("Exit from Networking book.");
				               condition1=false;
				               break;
				        default: System.out.println("Invalid choice.. Plaese check to enter 1,2,3..");
				        }
					 }
				        break;
				        
				 case 2:
					 while(condition2) {
					 System.out.println("1.Details");
			        System.out.println("2.Borrowing");
			        System.out.println("3.Returning");
			        System.out.println("4.Exit");
			        System.out.print("Enter your choice: ");
			        int choiceAvaliablebook1 = input.nextInt();
			        double balance1=0;
			        switch(choiceAvaliablebook1) {
			        case 1:System.out.println("Detalis of book");
				       String DisplayLibraryBookNetworking ="select * from librarybooks where RowNo = 2";
				       rs= st.executeQuery(DisplayLibraryBookNetworking);
						 System.out.println("RowNO  BookName    author    Price");
						 while(rs.next()) {
							
							 int RowNo = rs.getInt(1);
							 String BookName = rs.getString(2);
							 String author = rs.getString(3);
							 double Price = rs.getDouble(4);
							 
							 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
							 
							 
						 }
						 break;
			        case 2: System.out.println("Select a Avalible to borrow.");
	                System.out.print("Enter your borrow book name:");
	                String borrowBook = input.next();
	                String DisplayLibraryBookNetworkingMoney ="select Price from librarybooks where RowNo = 2";
				       rs= st.executeQuery(DisplayLibraryBookNetworkingMoney);
				       double Price =0;
				       double amountpaid=0;
						 if(rs.next()) {
							  Price = rs.getDouble(1);
							 
							 
							 System.out.println(" Book Amount is  "+Price);
						 
							 System.out.print("Enter Amount to borrow a book: ");
							 int amount= input.nextInt();
							  amountpaid=(int)amount;
							 if(amountpaid==Price) {
								 System.out.println("Thankyou borrowed a book.");
								 
							 
							 
						 }
							 else {
								  balance1 = Price-amountpaid;
								 System.out.println("Your Total balance to borrow a  book is "+balance1);
							 }
						 }
							
							 System.out.print("Enter a date (YYYY-MM-DD): ");
							 String borrowdate= input.next();
						//	 LocalDate inputDate = LocalDate.parse(borrowdate);
							 System.out.println();
							 System.out.print("Enter Number. How Many days do you need a book: ");
							 int validdate = input.nextInt();
							 System.out.println();
							 System.out.print("When you return a book to Mylibrary.Enter a exact date (YYYY-MM-DD): ");
							 String Dateofreturn = input.next();
							 preparedStatement.setString(3, borrowdate);
							 preparedStatement.setInt(4, validdate);
							 preparedStatement.setString(5, Dateofreturn);
							 preparedStatement.setDouble(6, amountpaid);
							 preparedStatement.setDouble(7, balance1);
							 int rowsAffected = preparedStatement.executeUpdate();

							 
							 
							 break;
							 
	        case 3:
	        	 String DisplayLibraryBookNetworkingMoneybalance ="select BalanceAmount from userside where SNo=2";
			       rs= st.executeQuery(DisplayLibraryBookNetworkingMoneybalance);
			       double balancechecking =0;
					 if(rs.next()) {
						  balancechecking = rs.getDouble(1);
						  System.out.print("Enter your Book Name to return: ");
				        	String returnBook= input.next();
				        	if(balancechecking == 0) {
				        		System.out.println("Great Job. Thanks for visiting mylibrary..");
				        	}
				        	else {
				        		System.out.println("You have balance amount is "+balancechecking+" to pay.");
				        		System.out.print("pay your Balance: ");
				        		double paybalance = input.nextDouble();
				        		if(paybalance==balancechecking) {
				        			System.out.println("Great job. Thanking you for paying balance amount...");
				        		}else {
				        			
					                System.out.print("Pay your balance amount:");
					                String balancepay = input.next();
				        		}
				        	}
						 
						 
					 }
	        	
	        	
	        	
	        	
	        	
	        	
	        	break;
			        case 4 : System.out.println("EXit from Arthimetic book.");
			                 condition2= false;
			                 break;
			        default: System.out.println("Invalid choice.. Plaese check to enter 1,2,3..");
			        }
					 }
			        break;
				 case 3:
					 while(condition3) {
					 
					 System.out.println("1.Details");
			        System.out.println("2.Borrowing");
			        System.out.println("3.Returning");
			        System.out.println("4.Exit");
			        System.out.print("Enter your choice: ");
			        int choiceAvaliablebook2 = input.nextInt();
			        double balance2=0;
			        switch(choiceAvaliablebook2) {
			        case 1:System.out.println("Detalis of book");
				       String DisplayLibraryBookNetworking ="select * from librarybooks where RowNo = 3";
				       rs= st.executeQuery(DisplayLibraryBookNetworking);
						 System.out.println("RowNO  BookName    author    Price");
						 while(rs.next()) {
							
							 int RowNo = rs.getInt(1);
							 String BookName = rs.getString(2);
							 String author = rs.getString(3);
							 double Price = rs.getDouble(4);
							 
							 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
							 
							 
						 }
						 break;
			        case 2: System.out.println("Select a Avalible to borrow.");
	                System.out.print("Enter your borrow book name:");
	                String borrowBook = input.next();
	                String DisplayLibraryBookNetworkingMoney ="select Price from librarybooks where RowNo = 3";
				       rs= st.executeQuery(DisplayLibraryBookNetworkingMoney);
				       double Price =0;
				       double amountpaid=0;
						 if(rs.next()) {
							  Price = rs.getDouble(1);
							 
							 
							 System.out.println(" Book Amount is  "+Price);
						 
							 System.out.print("Enter Amount to borrow a book: ");
							 int amount= input.nextInt();
							  amountpaid=(int)amount;
							 if(amountpaid==Price) {
								 System.out.println("Thankyou borrowed a book.");
								 
							 
							 
						 }
							 else {
								  balance2 = Price-amountpaid;
								 System.out.println("Your Total balance to borrow a  book is "+balance2);
							 }
						 }
							
							 System.out.print("Enter a date (YYYY-MM-DD): ");
							 String borrowdate= input.next();
						//	 LocalDate inputDate = LocalDate.parse(borrowdate);
							 System.out.println();
							 System.out.print("Enter Number. How Many days do you need a book: ");
							 int validdate = input.nextInt();
							 System.out.println();
							 System.out.print("When you return a book to Mylibrary.Enter a exact date (YYYY-MM-DD): ");
							 String Dateofreturn = input.next();
							 preparedStatement.setString(3, borrowdate);
							 preparedStatement.setInt(4, validdate);
							 preparedStatement.setString(5, Dateofreturn);
							 preparedStatement.setDouble(6, amountpaid);
							 preparedStatement.setDouble(7, balance2);
							 int rowsAffected = preparedStatement.executeUpdate();

							 
							 
							 break;
							 
	        case 3:
	        	 String DisplayLibraryBookNetworkingMoneybalance ="select BalanceAmount from userside where SNo=3";
			       rs= st.executeQuery(DisplayLibraryBookNetworkingMoneybalance);
			       double balancechecking =0;
					 if(rs.next()) {
						  balancechecking = rs.getDouble(1);
						  System.out.print("Enter your Book Name to return: ");
				        	String returnBook= input.next();
				        	if(balancechecking == 0) {
				        		System.out.println("Great Job. Thanks for visiting mylibrary..");
				        	}
				        	else {
				        		System.out.println("You have balance amount is "+balancechecking+" to pay.");
				        		System.out.print("pay your Balance: ");
				        		double paybalance = input.nextDouble();
				        		if(paybalance==balancechecking) {
				        			System.out.println("Great job. Thanking you for paying balance amount...");
				        		}else {
				        			
					                System.out.print("Pay your balance amount:");
					                String balancepay = input.next();
				        		}
				        	}
						 
						 
					 }
	        	
	        	
	        	
	        	
	        	
	        	
	        	break;
			        case 4: System.out.println("Exit from Developing book");
			                condition3=false;
			                break;
			        default: System.out.println("Invalid choice.. Plaese check to enter 1,2,3..");
			        }
					 }
			        break;
				 case 4:
					 while(condition4) {
					 System.out.println("1.Details");
			        System.out.println("2.Borrowing");
			        System.out.println("3.Returning");
			        System.out.println("4.Exit");
			        System.out.print("Enter your choice: ");
			        int choiceAvaliablebook3 = input.nextInt();
			        double balance3=0;
			        switch(choiceAvaliablebook3) {
			        case 1:System.out.println("Detalis of book");
				       String DisplayLibraryBookNetworking ="select * from librarybooks where RowNo = 4";
				       rs= st.executeQuery(DisplayLibraryBookNetworking);
						 System.out.println("RowNO  BookName    author    Price");
						 while(rs.next()) {
							
							 int RowNo = rs.getInt(1);
							 String BookName = rs.getString(2);
							 String author = rs.getString(3);
							 double Price = rs.getDouble(4);
							 
							 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
							 
							 
						 }
						 break;
			        case 2: System.out.println("Select a Avalible to borrow.");
	                System.out.print("Enter your borrow book name:");
	                String borrowBook = input.next();
	                String DisplayLibraryBookNetworkingMoney ="select Price from librarybooks where RowNo = 4";
				       rs= st.executeQuery(DisplayLibraryBookNetworkingMoney);
				       double Price =0;
				       double amountpaid=0;
						 if(rs.next()) {
							  Price = rs.getDouble(1);
							 
							 
							 System.out.println(" Book Amount is  "+Price);
						 
							 System.out.print("Enter Amount to borrow a book: ");
							 int amount= input.nextInt();
							  amountpaid=(int)amount;
							 if(amountpaid==Price) {
								 System.out.println("Thankyou borrowed a book.");
								 
							 
							 
						 }
							 else {
								  balance3 = Price-amountpaid;
								 System.out.println("Your Total balance to borrow a  book is "+balance3);
							 }
						 }
							
							 System.out.print("Enter a date (YYYY-MM-DD): ");
							 String borrowdate= input.next();
						//	 LocalDate inputDate = LocalDate.parse(borrowdate);
							 System.out.println();
							 System.out.print("Enter Number. How Many days do you need a book: ");
							 int validdate = input.nextInt();
							 System.out.println();
							 System.out.print("When you return a book to Mylibrary.Enter a exact date (YYYY-MM-DD): ");
							 String Dateofreturn = input.next();
							 preparedStatement.setString(3, borrowdate);
							 preparedStatement.setInt(4, validdate);
							 preparedStatement.setString(5, Dateofreturn);
							 preparedStatement.setDouble(6, amountpaid);
							 preparedStatement.setDouble(7, balance3);
							 int rowsAffected = preparedStatement.executeUpdate();

							 
							 
							 break;
							 
	        case 3:
	        	 String DisplayLibraryBookNetworkingMoneybalance ="select BalanceAmount from userside where SNo=4";
			       rs= st.executeQuery(DisplayLibraryBookNetworkingMoneybalance);
			       double balancechecking =0;
					 if(rs.next()) {
						  balancechecking = rs.getDouble(1);
						  System.out.print("Enter your Book Name to return: ");
				        	String returnBook= input.next();
				        	if(balancechecking == 0) {
				        		System.out.println("Great Job. Thanks for visiting mylibrary..");
				        	}
				        	else {
				        		System.out.println("You have balance amount is "+balancechecking+" to pay.");
				        		System.out.print("pay your Balance: ");
				        		double paybalance = input.nextDouble();
				        		if(paybalance==balancechecking) {
				        			System.out.println("Great job. Thanking you for paying balance amount...");
				        		}else {
				        			
					                System.out.print("Pay your balance amount:");
					                String balancepay = input.next();
				        		}
				        	}
						 
						 
					 }
	        	
	        	
	        	
	        	
	        	
	        	
	        	break;
			        case 4:System.out.println("Exit from Management book.");
			               condition4=false;
			               break;
			        	
			        default: System.out.println("Invalid choice.. Plaese check to enter 1,2,3..");
			        }
					 }
			        break;
			        
				 case 5:
					 while(condition5) {
					 System.out.println("1.Details");
			        System.out.println("2.Borrowing");
			        System.out.println("3.Returning");
			        System.out.println("4.Exit");
			        System.out.print("Enter your choice: ");
			        int choiceAvaliablebook4 = input.nextInt();
			        double balance4=0;
			        switch(choiceAvaliablebook4) {
			        case 1:System.out.println("Detalis of book");
				       String DisplayLibraryBookNetworking ="select * from librarybooks where RowNo = 5";
				       rs= st.executeQuery(DisplayLibraryBookNetworking);
						 System.out.println("RowNO  BookName    author    Price");
						 while(rs.next()) {
							
							 int RowNo = rs.getInt(1);
							 String BookName = rs.getString(2);
							 String author = rs.getString(3);
							 double Price = rs.getDouble(4);
							 
							 System.out.println(RowNo+"    "+BookName+"  "+author+"  "+Price);
							 
							 
						 }
						 break;
			        case 2: System.out.println("Select a Avalible to borrow.");
	                System.out.print("Enter your borrow book name:");
	                String borrowBook = input.next();
	                String DisplayLibraryBookNetworkingMoney ="select Price from librarybooks where RowNo = 5";
				       rs= st.executeQuery(DisplayLibraryBookNetworkingMoney);
				       double Price =0;
				       double amountpaid=0;
						 if(rs.next()) {
							  Price = rs.getDouble(1);
							 
							 
							 System.out.println(" Book Amount is  "+Price);
						 
							 System.out.print("Enter Amount to borrow a book: ");
							 int amount= input.nextInt();
							  amountpaid=(int)amount;
							 if(amountpaid==Price) {
								 System.out.println("Thankyou borrowed a book.");
								 
							 
							 
						 }
							 else {
								  balance4 = Price-amountpaid;
								 System.out.println("Your Total balance to borrow a  book is "+balance4);
							 }
						 }
							
							 System.out.print("Enter a date (YYYY-MM-DD): ");
							 String borrowdate= input.next();
						//	 LocalDate inputDate = LocalDate.parse(borrowdate);
							 System.out.println();
							 System.out.print("Enter Number. How Many days do you need a book: ");
							 int validdate = input.nextInt();
							 System.out.println();
							 System.out.print("When you return a book to Mylibrary.Enter a exact date (YYYY-MM-DD): ");
							 String Dateofreturn = input.next();
							 preparedStatement.setString(3, borrowdate);
							 preparedStatement.setInt(4, validdate);
							 preparedStatement.setString(5, Dateofreturn);
							 preparedStatement.setDouble(6, amountpaid);
							 preparedStatement.setDouble(7, balance4);
							 int rowsAffected = preparedStatement.executeUpdate();

							 
							 
							 break;
							 
	        case 3:
	        	 String DisplayLibraryBookNetworkingMoneybalance ="select BalanceAmount from userside where SNo=5";
			       rs= st.executeQuery(DisplayLibraryBookNetworkingMoneybalance);
			       double balancechecking =0;
					 if(rs.next()) {
						  balancechecking = rs.getDouble(1);
						  System.out.print("Enter your Book Name to return: ");
				        	String returnBook= input.next();
				        	if(balancechecking == 0) {
				        		System.out.println("Great Job. Thanks for visiting mylibrary..");
				        	}
				        	else {
				        		System.out.println("You have balance amount is "+balancechecking+" to pay.");
				        		System.out.print("pay your Balance: ");
				        		double paybalance = input.nextDouble();
				        		if(paybalance==balancechecking) {
				        			System.out.println("Great job. Thanking you for paying balance amount...");
				        		}else {
				        			
					                System.out.print("Pay your balance amount:");
					                String balancepay = input.next();
				        		}
				        	}
						 
						 
					 }
	        	
	        	
	        	
	        	
	        	
	        	
	        	break;
			        case 4:System.out.println("Exit from WorldBook.");
			               condition5=false;
			               break;
			        default: System.out.println("Invalid choice.. Plaese check to enter 1,2,3..");
			        }
					 }
			        break;
				 case 6: System.out.println("Thank you for visting mylibrary..");
				         System.exit(0);
				         break;
				         
					 
				default:System.out.println("Invalid choice you entered.Avaliable books 1,2,3,4,5,6.."); 
				 }
				 
				
			}
			}
			else {
				System.out.println("Invalid Userid and Password. Try Again..");
				System.out.println("Try again to Login. Enter correct login cerditails.");
			}
		 }
			
			
			 
			
		
		
		
		
		
		
		
		
		
//		 } catch (ClassNotFoundException | SQLException e) {
//	            e.printStackTrace();
//	        } finally {
//	            // Close resources in the reverse order of their creation
//	            try {
//	                if (st != null) {
//	                    st.close();
//	                }
//	                if (con != null) {
//	                    con.close();
//	                }
//	            } catch (SQLException e) {
//	                e.printStackTrace();
//	            }
//	        }
	    }

	}
