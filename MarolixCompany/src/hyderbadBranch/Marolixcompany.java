package hyderbadBranch;

import java.util.ArrayList;
import java.util.Scanner;

public class Marolixcompany{
	Scanner sc = new Scanner(System.in);
	
	 ArrayList<String> JavaEmployeeName = new ArrayList<>();
	 ArrayList<String> JavaEmployeeId = new ArrayList<>();
	 ArrayList<Integer> JavaEmployeeSalary = new ArrayList<>();
	 
	 public void addingArraylistJavaEmployee() {
		 JavaEmployeeName.add("mathew");
		 JavaEmployeeName.add("rahul");
		 JavaEmployeeName.add("siva");
		 JavaEmployeeName.add("Ganesh");
		 JavaEmployeeId.add("MT-01627");
		 JavaEmployeeId.add("MT-01234");
		 JavaEmployeeId.add("MT-01345");
		 JavaEmployeeId.add("MT-01623");
		 JavaEmployeeSalary.add(30000);
		 JavaEmployeeSalary.add(16000);
		 JavaEmployeeSalary.add(20000);
		 JavaEmployeeSalary.add(30000);
		 
		 
	 }
	 
	
	 
	 
	 ArrayList<String> PythonEmployeeName = new ArrayList<>();
	 ArrayList<String> PythonEmployeeId = new ArrayList<>();
	 ArrayList<Integer> PythonEmployeeSalary = new ArrayList<>();
	 
	 
	 public void addingArrayListPythonEmployee() {
		 PythonEmployeeName.add("Poojitha");
		 PythonEmployeeName.add("Sujii");
		 PythonEmployeeName.add("Mahesh");
		 PythonEmployeeId.add("MT-01546");
		 PythonEmployeeId.add("MT-01265");
		 PythonEmployeeId.add("MT-01243");
		 PythonEmployeeSalary.add(20000);
		 PythonEmployeeSalary.add(25000);
		 PythonEmployeeSalary.add(15000);
		 
		
	 }
	 
	 
	 ArrayList<String> DevopsEmployeeName = new ArrayList<>();
	 ArrayList<String> DevopsEmployeeId = new ArrayList<>();
	 ArrayList<Integer> DevopsEmployeeSalary = new ArrayList<>();
	 
	 
	 public void addingArrayListDevopsEmployee() {
		 DevopsEmployeeName.add("Nelayya");
		 DevopsEmployeeName.add("nani");
		 DevopsEmployeeName.add("Haneef");
		 DevopsEmployeeId.add("MT-01267");
		 DevopsEmployeeId.add("MT-2451");
		 DevopsEmployeeId.add("MT-01235");
		 DevopsEmployeeSalary.add(13000);
		 DevopsEmployeeSalary.add(15000);
		 DevopsEmployeeSalary.add(25000);
		 
	 }
	 
	 ArrayList<String> SalesforceEmployeeName = new ArrayList<>();
	 ArrayList<String> SalesforceEmployeeId = new ArrayList<>();
	 ArrayList<Integer> SalesforceEmployeeSalary = new ArrayList<>();
	 
	 public void addingArrayListSalesforceEmployee() {
		 SalesforceEmployeeName.add("srisha");
		 SalesforceEmployeeName.add("vinod");
		 SalesforceEmployeeName.add("kumar");
		 SalesforceEmployeeId.add("MT-0234");
		 SalesforceEmployeeId.add("MT-1340");
		 SalesforceEmployeeId.add("MT-1236");
		 SalesforceEmployeeSalary.add(13000);
		 SalesforceEmployeeSalary.add(17000);
		 SalesforceEmployeeSalary.add(2500);
		 
		 
	 }
	 
	 ArrayList<String> TestingEmployeeName = new ArrayList<>();
	 ArrayList<String> TestingEmployeeId = new ArrayList<>();
	 ArrayList<Integer> TestingEmployeeSalary = new ArrayList<>();
	 
	 public void addingArrayListTestingEmployee() {
		 TestingEmployeeName.add("naveen");
		 TestingEmployeeName.add("satish");
		 TestingEmployeeId.add("MT-3124");
		 TestingEmployeeId.add("MT-0456");
		 TestingEmployeeSalary.add(15000);
		 TestingEmployeeSalary.add(23000);
		 
	 }
	 
	 ArrayList<String> UiUxEmployeeName = new ArrayList<>();
	 ArrayList<String> UiUxEmployeeId = new ArrayList<>();
	 ArrayList<Integer> UiUxEmployeeSalary = new ArrayList<>();
	 
	 public void addingArrayListUiUxEmployee() {
		 UiUxEmployeeName.add("Kiran");
		 UiUxEmployeeName.add("satish");
		 UiUxEmployeeId.add("MT-1213");
		 UiUxEmployeeId.add("MT-2134");
		 UiUxEmployeeSalary.add(12000);
		 UiUxEmployeeSalary.add(27000);
	 }
	 
	 ArrayList<String> DigitialMarketingEmployeeName = new ArrayList<>();
	 ArrayList<String> DigitialMarketingEmployeeId = new ArrayList<>();
	 ArrayList<Integer> DigitialMarketingEmployeeSalary = new ArrayList<>();
	 
	 public void addingArrayListDigitailMarketingEmployee() {
		 DigitialMarketingEmployeeName.add("srikanth");
		 DigitialMarketingEmployeeName.add("chakradhar");
		 DigitialMarketingEmployeeId.add("MT-3413");
		 DigitialMarketingEmployeeId.add("MT-2154");
		 DigitialMarketingEmployeeSalary.add(22000);
		 DigitialMarketingEmployeeSalary.add(28000);
	 }
	 
	 
	 ArrayList<String> WebDevelopmentEmployeeName = new ArrayList<>();
	 ArrayList<String> WebDevelopmentEmployeeId = new ArrayList<>();
	 ArrayList<Integer> WebDevelopmentEmployeeSalary = new ArrayList<>();
	 
	 public void addingArrayListWebDevelopmenEmployee() {
		 WebDevelopmentEmployeeName.add("Mathew");
		 WebDevelopmentEmployeeName.add("sandiliya");
		 WebDevelopmentEmployeeId.add("MT-5261");
		 WebDevelopmentEmployeeId.add("MT-3144");
		 WebDevelopmentEmployeeSalary.add(32000);
		 WebDevelopmentEmployeeSalary.add(18000);
	 }

	
	public void Password() {
		System.out.println("Create your LoginId:");
		String Loginid = sc.nextLine();
		System.out.println("Create your password");
		 String password = sc.nextLine();
		 System.out.println("Register sucessfull. Go To LOgin");
		System.out.println("Enter your loginid");
		String Inputloginid = sc.nextLine();
		System.out.println("Enter your password");
		String Inputpassword = sc	.nextLine();
		
		if((Loginid.equals(Inputloginid))&&(password.equals(Inputpassword))) {
			
			
			
		}
		else {
			System.out.println("Invalid password");
		}
	}
	
	
		
	
	public void javaaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            JavaEmployeeName.add(addemploye);
	            JavaEmployeeId.add(addemployeId);
	            JavaEmployeeSalary.add(addSalary);
	           
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<JavaEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+JavaEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+JavaEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+JavaEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}
	
	
	public void pythonaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            PythonEmployeeName.add(addemploye);
	            PythonEmployeeId.add(addemployeId);
	            PythonEmployeeSalary.add(addSalary);
	           
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<PythonEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+PythonEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+PythonEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+PythonEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}
	
	
	public void devopsaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            DevopsEmployeeName.add(addemploye);
	            DevopsEmployeeId.add(addemployeId);
	            DevopsEmployeeSalary.add(addSalary);
	            addingArrayListDevopsEmployee();
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<DevopsEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+DevopsEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+DevopsEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+DevopsEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}

	
	public void salesforceaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            SalesforceEmployeeName.add(addemploye);
	            SalesforceEmployeeId.add(addemployeId);
	            SalesforceEmployeeSalary.add(addSalary);
	            
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<SalesforceEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+SalesforceEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+SalesforceEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+SalesforceEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}
	
	
	public void testingaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            TestingEmployeeName.add(addemploye);
	            TestingEmployeeId.add(addemployeId);
	            TestingEmployeeSalary.add(addSalary);
	           
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<TestingEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+TestingEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+TestingEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+TestingEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}

	public void uiuxaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            UiUxEmployeeName.add(addemploye);
	            UiUxEmployeeId.add(addemployeId);
	            UiUxEmployeeSalary.add(addSalary);
	           
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<UiUxEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+UiUxEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+UiUxEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+UiUxEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}

		
	public void digitialMarketingaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            DigitialMarketingEmployeeName.add(addemploye);
	            DigitialMarketingEmployeeId.add(addemployeId);
	            DigitialMarketingEmployeeSalary.add(addSalary);
	            
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<DigitialMarketingEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+DigitialMarketingEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+DigitialMarketingEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+DigitialMarketingEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}
	
	public void webDevelopmentaddEmployee() {
		
        
	       
        while (true) {
        	
        	System.out.println("Add Employee.Employee Details...");
        	System.out.println();
        	System.out.println("Do you want to add a New employee.Enter YES are NO");
        	String choiceStatement = sc.next();
        	if(choiceStatement.equalsIgnoreCase("no")) {
        		break;
        	}
        	else if(choiceStatement.equalsIgnoreCase("yes")){
        		
        	System.out.println();
        	System.out.print("Enter Employee name: ");
            String addemploye = sc.next();
            System.out.println();
           
        	 
        	 
        	
        		   System.out.print("Enter Employee Salary: ");
   	            int addSalary = sc.nextInt();
   	            System.out.println();
   	          
	            sc.nextLine();
	            System.out.print("Enter Employee Id: ");
	            String addemployeId = sc.nextLine();
	            System.out.println();
	         
	            System.out.println(addemploye+" Employee is added succesfully");
	            
	          
	            WebDevelopmentEmployeeName.add(addemploye);
	            WebDevelopmentEmployeeId.add(addemployeId);
	            WebDevelopmentEmployeeSalary.add(addSalary);
	            
	            
        	}
        	else {
        		System.out.println("Sorry Invalid Input, Enter YES are NO.Try Again");
        	}
                                                                                                                                                                                          	 
	         
            
        
        }
        	 
        System.out.println("Employees List...");
        
        for(int i=0;i<WebDevelopmentEmployeeSalary.size();i++) {
        	System.out.print("Employee Name: "+WebDevelopmentEmployeeName.get(i)+", ");
        	System.out.print("Employee Id: "+WebDevelopmentEmployeeId.get(i)+", ");
        	System.out.println("Employee Salary: "+WebDevelopmentEmployeeSalary.get(i)+" ");
        }
        System.out.println();

       /* System.out.println("Employee Names:");
        for (String employ : EmployeeName) {
            System.out.println(employ);
        }*/
 
}

	

	
	
	


	
	
	
	
	
	

	public void javaclearallEmployee(){
		if(JavaEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
			JavaEmployeeName.clear();
			JavaEmployeeId.clear();
			JavaEmployeeSalary.clear();
			
			System.out.println("Removed all the Employees sucessfully..");
			System.out.println("Go to addEmployee.. TO add An new Employee..");
			
		}
	}
	
	public void pythonclearallEmployee(){
		if(PythonEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		PythonEmployeeName.clear();
		PythonEmployeeId.clear();
		PythonEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
	}
	public void DevopsclearallEmployee(){
		if(DevopsEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		DevopsEmployeeName.clear();
		DevopsEmployeeId.clear();
		DevopsEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
		
	}
	
	public void SalesforceclearallEmployee(){
		if(SalesforceEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		SalesforceEmployeeName.clear();
		SalesforceEmployeeId.clear();
		SalesforceEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
	}
	
	public void testingclearallEmployee(){
		if(TestingEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		TestingEmployeeName.clear();
		TestingEmployeeId.clear();
		TestingEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
	}
	
	public void UiUxclearallEmployee(){
		if(UiUxEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		UiUxEmployeeName.clear();
		UiUxEmployeeId.clear();
		UiUxEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
	}
	
	public void DigitialMarketingclearallEmployee(){
		if(DigitialMarketingEmployeeName.isEmpty()) {
			System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
		}
		else
		{
		DigitialMarketingEmployeeName.clear();
		DigitialMarketingEmployeeId.clear();
		DigitialMarketingEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
		}
	}
	
public void webDevlopmentclearallEmployee(){
	if(WebDevelopmentEmployeeName.isEmpty()) {
		System.out.println("sorry, There is no employee to clear. Go to add a new Employee..");
	}
	else
	{
		WebDevelopmentEmployeeName.clear();
		WebDevelopmentEmployeeId.clear();
		WebDevelopmentEmployeeSalary.clear();
		
		System.out.println("Removed all the Employees sucessfully..");
		System.out.println("Go to addEmployee.. TO add An new Employee..");
	}
	}





public void javaremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<JavaEmployeeId.size();k++) {
    	   if(JavaEmployeeId.contains(removeemp)|| JavaEmployeeName.contains(removeemp) || JavaEmployeeId.contains(removeemp)) {
       		
      		 JavaEmployeeId.remove(removeemp);
      		 JavaEmployeeName.remove(k);
      		 JavaEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<JavaEmployeeSalary.size();p++) {
    	System.out.print("JavaEmployee Name: "+JavaEmployeeName.get(p)+", ");
    	System.out.print("JavaEmployee Id: "+JavaEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}



public void pythonremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<PythonEmployeeId.size();k++) {
    	   if(PythonEmployeeId.contains(removeemp)|| PythonEmployeeName.contains(removeemp) || PythonEmployeeId.contains(removeemp)) {
       		
      		 PythonEmployeeId.remove(removeemp);
      		 PythonEmployeeName.remove(k);
      		 PythonEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<PythonEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+PythonEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+PythonEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}



public void salesforceremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<SalesforceEmployeeId.size();k++) {
    	   if(SalesforceEmployeeId.contains(removeemp)|| SalesforceEmployeeName.contains(removeemp) || SalesforceEmployeeId.contains(removeemp)) {
       		
    		   SalesforceEmployeeId.remove(removeemp);
    		   SalesforceEmployeeName.remove(k);
    		   SalesforceEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<SalesforceEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+SalesforceEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+SalesforceEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}




public void testingremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<TestingEmployeeId.size();k++) {
    	   if(TestingEmployeeId.contains(removeemp)|| TestingEmployeeName.contains(removeemp) || TestingEmployeeId.contains(removeemp)) {
       		
    		   TestingEmployeeId.remove(removeemp);
    		   TestingEmployeeName.remove(k);
    		   TestingEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<TestingEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+TestingEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+TestingEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}


public void uiuxremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<UiUxEmployeeId.size();k++) {
    	   if(UiUxEmployeeId.contains(removeemp)|| UiUxEmployeeName.contains(removeemp) || UiUxEmployeeId.contains(removeemp)) {
       		
    		   UiUxEmployeeId.remove(removeemp);
    		   UiUxEmployeeName.remove(k);
    		   UiUxEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<UiUxEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+UiUxEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+UiUxEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}



public void digitailMarketingremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<DigitialMarketingEmployeeId.size();k++) {
    	   if(DigitialMarketingEmployeeId.contains(removeemp)|| DigitialMarketingEmployeeName.contains(removeemp) || DigitialMarketingEmployeeId.contains(removeemp)) {
       		
    		   DigitialMarketingEmployeeId.remove(removeemp);
    		   DigitialMarketingEmployeeName.remove(k);
    		   DigitialMarketingEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<DigitialMarketingEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+DigitialMarketingEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+DigitialMarketingEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}



public void webdevelopmentremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<WebDevelopmentEmployeeId.size();k++) {
    	   if(WebDevelopmentEmployeeId.contains(removeemp)|| WebDevelopmentEmployeeName.contains(removeemp) || WebDevelopmentEmployeeId.contains(removeemp)) {
       		
    		   WebDevelopmentEmployeeId.remove(removeemp);
    		   WebDevelopmentEmployeeName.remove(k);
    		   WebDevelopmentEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<WebDevelopmentEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+WebDevelopmentEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+WebDevelopmentEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}

	


public void devopsremoveEmployee() {
   

    while (true) {
    	System.out.println("Remove Employeee.....");
    	System.out.println("Do you want to Remove a employee.. So, Enter YES are NO");
    	String removeChoiceStatement = sc.next();
    	if(removeChoiceStatement.equalsIgnoreCase("no")) {
    		break;
    	}
    	else if(removeChoiceStatement.equalsIgnoreCase("yes")) {
    		
    	System.out.println();
        System.out.print("remove Employee..Enter Employee Id (or) Employee Name (or) Employee Salary : ");
        
        
        String removeemp = sc.next();
        System.out.println();
       
        System.out.println(removeemp+" Employee is remove succesfully");
      
        
       for(int k=0; k<DevopsEmployeeId.size();k++) {
    	   if(DevopsEmployeeId.contains(removeemp)|| DevopsEmployeeName.contains(removeemp) || DevopsEmployeeId.contains(removeemp)) {
       		
    		   DevopsEmployeeId.remove(removeemp);
    		   DevopsEmployeeName.remove(k);
    		   DevopsEmployeeSalary.remove(k);
      	 }
  
       }
       System.out.println();
       
       
    	}
    	else {
    		System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
    	}

        

       
    }

   /* System.out.print("\n Employee Id:");
    
    for (String Employee : EmployeeId) {
        System.out.println(Employee);
    }*/
    for(int p=0;p<DevopsEmployeeSalary.size();p++) {
    	System.out.print("Employee Name: "+DevopsEmployeeName.get(p)+", ");
    	System.out.print("Employee Id: "+DevopsEmployeeId.get(p)+", ");
    	
    }
    System.out.println();

}
	

	
	
	
	
	public void javaaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee List");
	        	
	        	System.out.println("5.clear all Employee");
	        	
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : javaaddEmployee();
		                  break;
		         case 2 : boolean answer =  JavaEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 javaremoveEmployee();
			                  break; 
		                 }
		         case 3 : javaupdateProfile();
		                  break;
		         case 4: if(JavaEmployeeName.isEmpty()) {
		        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
		         }
		         else {
		        	 System.out.println("Java Employee List: ");
	                 for(int j = 0; j<JavaEmployeeName.size();j++) {
	                	
	                	 System.out.print("Employee Name: "+JavaEmployeeName.get(j)+", ");
	                	 System.out.print("Employee Id: "+JavaEmployeeId.get(j)+", ");
	                	 System.out.println("Employee Salary: "+JavaEmployeeSalary.get(j)+" ");
	                	 
	                 }
	                 System.out.println();
		         }
		                 
		                 break;
		        	     
		         case 5 :
		                  javaclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	

	public void pythonaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile update");
	        	System.out.println("4.Employee List");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : pythonaddEmployee();
		                  break;
		         case 2 : boolean answer =  PythonEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 pythonremoveEmployee();
			                  break; 
		                 }
		         case 3:  pythonupdateProfile();
		                  break;
		         case 4:
		        	 if(PythonEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("Python Employee List: ");
                 for(int j = 0; j<PythonEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+PythonEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+PythonEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+PythonEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		        
		        	     
		         case 5 :
		                  pythonclearallEmployee();
		                  break;
		                  
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	
	

	public void salesforceaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee list");
	        	System.out.println("5.clear all Employee");
	        	
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : salesforceaddEmployee();
		                  break;
		         case 2 : boolean answer =  SalesforceEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 salesforceremoveEmployee();
			                  break; 
		                 }
		         case 3: salesforceupdateProfile();
		                 break;
		         case 4:
		        	 if(SalesforceEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("Sales force Employee List: ");
                 for(int j = 0; j<SalesforceEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+SalesforceEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+SalesforceEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+SalesforceEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		        	     
		         case 5 : 
		                  SalesforceclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	
	

	public void devopsaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile update");
	        	System.out.println("4.Employee list");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : devopsaddEmployee();
		                  break;
		         case 2 : boolean answer =  DevopsEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 devopsremoveEmployee();
			                  break; 
		                 }
		         case 3:  devopsupdateProfile();
		                  break;
		         case 4:
		        	 if(DevopsEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("Devops Employee List: ");
                 for(int j = 0; j<DevopsEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+DevopsEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+DevopsEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+DevopsEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		        	     
		         case 5 :
		                  DevopsclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	

	public void testingaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee List");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : testingaddEmployee();
		                  break;
		         case 2 : boolean answer =  TestingEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 testingremoveEmployee();
			                  break; 
		                 }
		         case 3:  testingupdateProfile();
		                  break;
		         case 4:
		        	 if(TestingEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("Testing Employee List: ");
                 for(int j = 0; j<TestingEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+TestingEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+TestingEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+TestingEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		                
		        	     
		         case 5 :
		                  testingclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	

	public void uiuxaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee List");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : uiuxaddEmployee();
		                  break;
		         case 2 : boolean answer =  UiUxEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 uiuxremoveEmployee();
			                  break; 
		                 }
		         case 3:uiuxupdateProfile();
		                break;
		         case 4:
		        	 if(UiUxEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("UiUx Employee List: ");
                 for(int j = 0; j<UiUxEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+UiUxEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+UiUxEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+UiUxEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		                
		        	     
		         case 5 :
		                  UiUxclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	

	public void digitialMarketingaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee list");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : digitialMarketingaddEmployee();
		                  break;
		         case 2 : boolean answer =  DigitialMarketingEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 digitailMarketingremoveEmployee();
			                  break; 
		                 }
		         case 3: digitailMarketingupdateProfile();
		                 break;
		                
		         case 4:
		        	 if(DigitialMarketingEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("Digtial Marketing Employee List: ");
                 for(int j = 0; j<PythonEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+DigitialMarketingEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+DigitialMarketingEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+DigitialMarketingEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		        	     
		         case 5 :
		                  DigitialMarketingclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	
	

	public void webdevelopmentaddingemployeeDetails() {
		
		boolean condition = true;
	       while(condition) {
				 System.out.println();
	        	System.out.println("Select the option");
	        	System.out.println("1.add Employee");
	        	System.out.println("2.remove Employee");
	        	System.out.println("3.Profile Update");
	        	System.out.println("4.Employee list");
	        	System.out.println("5.clear all Employee");
	        	System.out.println("6.exit");
	        	System.out.print("Enter your option: ");
		         int employtypeOption = sc.nextInt();
		         switch(employtypeOption) {
		         case 1 : webDevelopmentaddEmployee();
		                  break;
		         case 2 : boolean answer =  WebDevelopmentEmployeeName.isEmpty();
		                 if(answer ==true) {
		                	 System.out.println("Dear User, We are sorry, There is no Employees to remove..");
		                	 System.out.println("So, PLease go to add Employee..");
		                	 break;
		                 }
		                 else {
		                	 webdevelopmentremoveEmployee();
			                  break; 
		                 }
		         case 3: WebdevelopmentupdateProfile();
		                 break;
		         case 4:
		        	 if(WebDevelopmentEmployeeName.isEmpty()) {
			        	 System.out.println("Sorry, There is no employee to view. GO to add a new Employee.....");
			         }
			         else {
			        	 System.out.println("WebDevelopment Employee List: ");
                 for(int j = 0; j<WebDevelopmentEmployeeName.size();j++) {
	                	
                	 System.out.print("Employee Name: "+WebDevelopmentEmployeeName.get(j)+", ");
                	 System.out.print("Employee Id: "+WebDevelopmentEmployeeId.get(j)+", ");
                	 System.out.println("Employee Salary: "+WebDevelopmentEmployeeSalary.get(j)+" ");
                	 
                 }
                 System.out.println();
                 
			         }
                 break;
		                
		        	     
		         case 5 :
		                  webDevlopmentclearallEmployee();
		                  break;
		         case 6 : System.out.println("Your are logout successfully");
		                  condition=false;
		        	       break;
		        	     
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		        
       	 }
		         
		         
	         
       }
	}
	
	
	
	
	
   public void javaupdateProfile() {
	   System.out.println("JAVA Employee UPdates..");
	   if(JavaEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
		   while(true) {
				  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
				   String UserYesorNO = sc.next();
				    if(UserYesorNO.equalsIgnoreCase("no"))
				   {
					   
					  break;
				   }
				   else if(UserYesorNO.equalsIgnoreCase("yes")) {
					   boolean updatesOption= true;
					   while(updatesOption) {
						   System.out.println();
					   System.out.println("UPdate Details Options...");
					   System.out.println("1. Update Employee Name.");
					   System.out.println("2. Update Employee Id.");
					   System.out.println("3. Update Employee  Salary.");
					   System.out.println("4. Java Employee updated List");
					   System.out.println("5. Exit");
					   System.out.println();
					   System.out.println("Enter your OPtion: ");
					   int UserDataInput = sc.nextInt();
					   switch(UserDataInput) {
					   case 1: System.out.print("Enter  Employee name: ");
					   String InputEmployeeData = sc.next();
					   System.out.println();
					   System.out.print("Enter new NAME to update:  ");
					   String newDetails = sc.next();
					   
					   
					   for(int k = 0; k<JavaEmployeeName.size();k++) {
						  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
						   
						   if(JavaEmployeeName.get(k).contains(InputEmployeeData)) {
							//  int statementNextTrue = JavaEmployeeName.indexOf(i);
							 
							  
							   
							   JavaEmployeeName.set(k, newDetails);
							   
							   

							   
						   }
						   
					   }
					   System.out.println();
					   
					   
					   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
					   

					   
					   break;
					   
					   case 2: System.out.print("Enter  Employee Id..");
					   String InputEmployeeData2 = sc.next();
					   System.out.println();
					   System.out.print("Enter  new Id to update:  ");
					   String newDetails1 = sc.next();
					   
					   
					   for(int i = 0; i<JavaEmployeeId.size();i++) {
						   if(JavaEmployeeId.get(i).contains(InputEmployeeData2)) {
							   
							   JavaEmployeeId.set(i, newDetails1);

							   
						   }
					   }
					   System.out.println();
					   
					   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
					   

					      
					   break;
					   case 3:System.out.print("Enter  Employee name..");
					   String InputEmployeeData3 = sc.next();
					   System.out.println();
					   System.out.print("Enter Old Salary: ");
					   int inputSalary = sc.nextInt();
					   System.out.println();
					   System.out.print("Enter New SALARY to update:  ");
					   int newDetails3 = sc.nextInt();
					   for(int i = 0; i<JavaEmployeeSalary.size();i++) {
						   if(JavaEmployeeSalary.get(i)==inputSalary)  {
							  
							   
							   JavaEmployeeSalary.set(i, newDetails3);

							   
						   }
					   }
					   System.out.println();
					   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
					   
					   
					   break;
					   
					   case 4: System.out.println("Java Updated Employee list: ");
					   System.out.println();
					   for(int i=0;i<JavaEmployeeSalary.size();i++) {
				        	System.out.print("Employee Name: "+JavaEmployeeName.get(i)+", ");
				        	System.out.print("Employee Id: "+JavaEmployeeId.get(i)+", ");
				        	System.out.println("Employee Salary: "+JavaEmployeeSalary.get(i)+" ");
				        }
				        System.out.println();
				        
				        break;
				        
					   case 5: System.out.println("Java Employee List is Updated Sucessfully....");
					            System.out.println();
					            updatesOption=false;
					                 
					            break;
					            
					           
					   
					   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
					   }
					   }

				   }
				  
				   else {
					   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
				   }
				   	  
			  }
	   }
	
	   
   }
   
   
   
	
   public void pythonupdateProfile() {
	   System.out.println("Python Employee UPdates..");
	   if(PythonEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
		   
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<PythonEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(PythonEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   PythonEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<PythonEmployeeId.size();i++) {
				   if(PythonEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   PythonEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<PythonEmployeeSalary.size();i++) {
				   if(PythonEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   PythonEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("Python Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<PythonEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+PythonEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+PythonEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+PythonEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("Python Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	 }  
   }
   
   
   
   
	
   public void devopsupdateProfile() {
	   System.out.println("Devops Employee UPdates..");
	   if(DevopsEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<DevopsEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(DevopsEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   DevopsEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<DevopsEmployeeId.size();i++) {
				   if(DevopsEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   DevopsEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<DevopsEmployeeSalary.size();i++) {
				   if(DevopsEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   DevopsEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("Devops Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<DevopsEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+DevopsEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+DevopsEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+DevopsEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("Devops Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   }
	   
   }
   
   public void salesforceupdateProfile() {
	   System.out.println("sales force Employee UPdates..");
	   if(SalesforceEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<SalesforceEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(SalesforceEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   SalesforceEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<SalesforceEmployeeId.size();i++) {
				   if(SalesforceEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   SalesforceEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<SalesforceEmployeeSalary.size();i++) {
				   if(SalesforceEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   SalesforceEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("Salesforce Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<SalesforceEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+SalesforceEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+SalesforceEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+SalesforceEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("Salesforce Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   }
	   
   }
   
  
	
   
   public void testingupdateProfile() {
	   System.out.println("testing Employee UPdates..");
	   if(TestingEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<TestingEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(TestingEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   TestingEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<TestingEmployeeId.size();i++) {
				   if(TestingEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   TestingEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<TestingEmployeeSalary.size();i++) {
				   if(TestingEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   TestingEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("Testing Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<TestingEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+TestingEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+TestingEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+TestingEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("Testing Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   
	   }
   }
   
   
   
   
   public void uiuxupdateProfile() {
	   System.out.println("ui ux Employee UPdates..");
	   if(UiUxEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<UiUxEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(UiUxEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   UiUxEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<UiUxEmployeeId.size();i++) {
				   if(UiUxEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   UiUxEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<UiUxEmployeeSalary.size();i++) {
				   if(UiUxEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   UiUxEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("UiUx Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<UiUxEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+UiUxEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+UiUxEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+UiUxEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("UiUx Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   }
	   
   }
   
   
   
   public void digitailMarketingupdateProfile() {
	   System.out.println("digitail Marketing Employee UPdates..");
	   if(DigitialMarketingEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<DigitialMarketingEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(DigitialMarketingEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   DigitialMarketingEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<DigitialMarketingEmployeeId.size();i++) {
				   if(DigitialMarketingEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   DigitialMarketingEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<DigitialMarketingEmployeeSalary.size();i++) {
				   if(DigitialMarketingEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   DigitialMarketingEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("DigitialMarketing Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<DigitialMarketingEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+DigitialMarketingEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+DigitialMarketingEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+DigitialMarketingEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("DigitialMarketing Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   }
	   
   }
   
  
   public void WebdevelopmentupdateProfile() {
	   System.out.println(" Web development Employee UPdates..");
	   if(WebDevelopmentEmployeeName.isEmpty()) {
		   System.out.println("Sorry, There is no Employees to update. GO to add a new Employee");
	   }
	   else {
	  while(true) {
		  System.out.print("Do you want Update an Employee Details. Enter Yes (or) No: ");
		   String UserYesorNO = sc.next();
		    if(UserYesorNO.equalsIgnoreCase("no"))
		   {
			   
			  break;
		   }
		   else if(UserYesorNO.equalsIgnoreCase("yes")) {
			   boolean updatesOption= true;
			   while(updatesOption) {
				   System.out.println();
			   System.out.println("UPdate Details Options...");
			   System.out.println("1. Update Employee Name.");
			   System.out.println("2. Update Employee Id.");
			   System.out.println("3. Update Employee  Salary.");
			   System.out.println("4. Java Employee updated List");
			   System.out.println("5. Exit");
			   System.out.println();
			   System.out.println("Enter your OPtion: ");
			   int UserDataInput = sc.nextInt();
			   switch(UserDataInput) {
			   case 1: System.out.print("Enter  Employee name: ");
			   String InputEmployeeData = sc.next();
			   System.out.println();
			   System.out.print("Enter new NAME to update:  ");
			   String newDetails = sc.next();
			   
			   
			   for(int k = 0; k<WebDevelopmentEmployeeName.size();k++) {
				  // boolean statementtrue = JavaEmployeeName.contains(InputEmployeeData);
				   
				   if(WebDevelopmentEmployeeName.get(k).contains(InputEmployeeData)) {
					//  int statementNextTrue = JavaEmployeeName.indexOf(i);
					 
					  
					   
					   WebDevelopmentEmployeeName.set(k, newDetails);
					   
					   

					   
				   }
				   
			   }
			   System.out.println();
			   
			   
			   System.out.println("Employee Name: "+InputEmployeeData+" is updated into "+newDetails+" is done sucessfully...");
			   

			   
			   break;
			   
			   case 2: System.out.print("Enter  Employee Id..");
			   String InputEmployeeData2 = sc.next();
			   System.out.println();
			   System.out.print("Enter  new Id to update:  ");
			   String newDetails1 = sc.next();
			   
			   
			   for(int i = 0; i<WebDevelopmentEmployeeId.size();i++) {
				   if(WebDevelopmentEmployeeId.get(i).contains(InputEmployeeData2)) {
					   
					   WebDevelopmentEmployeeId.set(i, newDetails1);

					   
				   }
			   }
			   System.out.println();
			   
			   System.out.println("Employee Id: "+InputEmployeeData2+" is updated into "+newDetails1+" is done sucessfully...");
			   

			      
			   break;
			   case 3:System.out.print("Enter  Employee name..");
			   String InputEmployeeData3 = sc.next();
			   System.out.println();
			   System.out.print("Enter Old Salary: ");
			   int inputSalary = sc.nextInt();
			   System.out.println();
			   System.out.print("Enter New SALARY to update:  ");
			   int newDetails3 = sc.nextInt();
			   for(int i = 0; i<WebDevelopmentEmployeeSalary.size();i++) {
				   if(WebDevelopmentEmployeeSalary.get(i)==inputSalary)  {
					  
					   
					   WebDevelopmentEmployeeSalary.set(i, newDetails3);

					   
				   }
			   }
			   System.out.println();
			   System.out.println(InputEmployeeData3+" Salary: "+inputSalary+" is updated into "+newDetails3+" is done sucessfully...");
			   
			   
			   break;
			   
			   case 4: System.out.println("WebDevelopment Updated Employee list: ");
			   System.out.println();
			   for(int i=0;i<WebDevelopmentEmployeeSalary.size();i++) {
		        	System.out.print("Employee Name: "+WebDevelopmentEmployeeName.get(i)+", ");
		        	System.out.print("Employee Id: "+WebDevelopmentEmployeeId.get(i)+", ");
		        	System.out.println("Employee Salary: "+WebDevelopmentEmployeeSalary.get(i)+" ");
		        }
		        System.out.println();
		        
		        break;
		        
			   case 5: System.out.println("WebDevelopment Employee List is Updated Sucessfully....");
			            updatesOption=false;
			            break;
			           
			   
			   default:System.out.println("Sorry Invalid choice..select options 1,2,3.");
			   }
			   }

		   }
		  
		   else {
			   System.out.println("Sorry Invalid Input, Enter YES are NO..Try Again");
		   }
		   	  
	  }
	   }
	   
   }
   


	


	public void  hourReport() {
		System.out.print("Enter your hour report: ");
		String report = sc.nextLine();
		System.out.println("Thank you for submitting hour report. We recevied your report sucessfully..");
		System.out.println("once check your report...");
		System.out.println(report);
		
	}
	
	public void meetingShow() {
		System.out.println("Date:09/11/2023 : Hr Meeting at 10:30AM");
		System.out.println("Date:09/11/2023 : Teamlead Meeting at 11:40AM");
		System.out.println("Date:09/11/2023 : Team Disscusion at 2:15 PM");
	}
	
	
	


	
	
	public static void main(String[] args) {
		boolean condition1 = true;
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Marolixcompany obj = new Marolixcompany();
		Scanner ss = new Scanner(System.in);
		
		boolean condition = true;
		boolean conditionUser = true;
		boolean conditionType = true;
		boolean conditionemployee = true;
		System.out.print("Create your LoginId: ");
		String Loginid = input.nextLine();
		System.out.println();
		System.out.print("Create your password: ");
		 String password = input.nextLine();
		 System.out.println();
		 System.out.println("Register is successfull. Go TO Login credentials.");
		 System.out.println("Enter your Login credentials.");
		 while(condition1) {
		 System.out.println();
		System.out.print("Enter your loginid: ");
		
		String Inputloginid = input.nextLine();
		System.out.println();
		System.out.print("Enter your password: ");
		String Inputpassword = input.nextLine();
		System.out.println();
		
		if((Loginid.equals(Inputloginid))&&(password.equals(Inputpassword))) {
			System.out.println("Successfully logined...");
			System.out.println("Welcome to Marolix Technology Solutions PVT LTD....");
			
			while(conditionType) {
				
				System.out.println();
				System.out.println("Please select the type of User:");
				System.out.println("1.Admin");
				System.out.println("2.User");
				System.out.println("3.exit");
				
				System.out.print("Enter your option: ");
				byte Typeoption = input.nextByte();
				System.out.println();
				switch(Typeoption){
				case 1 : 
				
					while(conditionemployee) {
						System.out.println();
						System.out.println("Select your Domain");
						System.out.println("1.Java");
						System.out.println("2.python");
						System.out.println("3.devops");
						System.out.println("4.salesforce");
						System.out.println("5.Tesing");
						System.out.println("6.UI & Ux design");
						System.out.println("7.Digital Marketing");
						System.out.println("8.Web development");
						System.out.println("9.Exit");
						System.out.print("Enter your option: ");
						int domainType = input.nextInt();
						System.out.println();
						switch(domainType) {
						
						case 1:System.out.println("Welcome to java Domain");
						       obj.addingArraylistJavaEmployee();
						       obj.javaaddingemployeeDetails();
					           break;
						case 2:System.out.println("Welcome to python Domain");
						       obj.addingArrayListPythonEmployee();
					       obj.pythonaddingemployeeDetails();
				           break;
						case 3:System.out.println("Welcome to devops Domain");
						       obj.addingArrayListDevopsEmployee();
					       obj.devopsaddingemployeeDetails();
				           break;
						case 4:System.out.println("Welcome to salesforce Domain");
						       obj.addingArrayListSalesforceEmployee();
					       obj.salesforceaddingemployeeDetails();
				           break;
						case 5:System.out.println("Welcome to Testing Domain");
						       obj.addingArrayListTestingEmployee();
					       obj.testingaddingemployeeDetails();
				           break;
						case 6:System.out.println("Welcome to UI & Ux design Domain");
						       obj.addingArrayListUiUxEmployee();
					       obj.uiuxaddingemployeeDetails();
				           break;
				           
						case 7:System.out.println("Welcome to Digital Marketing Domain");
						       obj.addingArrayListDigitailMarketingEmployee();
					       obj.digitialMarketingaddingemployeeDetails();
				           break;
						case 8:System.out.println("Welcome to Web development Domain");
						       obj.addingArrayListWebDevelopmenEmployee();
					       obj.webdevelopmentaddingemployeeDetails();
				           break;
						case 9:System.out.println("");
						conditionemployee=false;
				           break;
				        default:System.out.println("INVALID choice. Please Try Again...Please select a valid or correct options 1,2,3,4,5,6,7,8,9.");
						
						
						}
						
						
						
					
					
				}
				        
	                       
					 
				   break;
						        
			
				               
				case 2 :  
					String passworduserexcess = "1234";
					
					System.out.println("Enter the four digit password: ");
					String passwordusermatch = input.next();
					if(passworduserexcess.equals(passwordusermatch)) {

						while(conditionUser) {
							System.out.println();
							System.out.println("Select the option");
							System.out.println("1.Hourly report");
							System.out.println("2.Meeting Shedule");
							System.out.println("3.Leave request");
							System.out.println("4.Logout");
							System.out.print("Enter your option: ");
					         int customertypeOption = input.nextInt();
					         switch(customertypeOption) {
					         case 1 :
					                 obj.hourReport();
					                 System.out.println();
					                 
					        	     break;
					         case 2: obj.meetingShow();
					                 System.out.println();
					                 break;
					         case 3: 
					 		         System.out.println("Enter your Employee Name, Date, EmployeeId, Reason for leave");
					 		        System.out.println("Enter your Leave Request: ");
							         String Leave = ss.nextLine();
							         System.out.println(Leave);
						             System.out.println("Leave Apporved..");
						             System.out.println();
					                 break;
					         case 4 :System.out.println("LogOut sucessfully done");
					         System.out.println();
					                 conditionUser=false;
			        	             break;
					         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
					         }
					         
							
						}
						
					}
					
					else {
						System.out.println("Invalid Login creditials. Try Again....");
					}
				
					
					
				break;
				case 3: System.out.println("Thank you for your work. Logout form Marolix techonology soluction pvt ltd company is successfully done. See you on Tommorrow ");
				        System.exit(0);
				        break;
				default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3.");
			
				         
				         
				}
				
			}

			

		}
		else {
			System.out.println("Invalid Userid and Password. Try Again..");
		}
		
		}
		
	}


	
	
	

	
}
