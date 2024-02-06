package String.com;

public class Testing {
	
	public void CharAT() {
		String name="Mathew";  
		char ch=name.charAt(4);  
		System.out.println(ch);
	}
	public void Length() {
		String s1="java";  
		String s2="Course";  
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length());
	}
	public void Substring() {
		String s1="Mathew";  
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(2));
	}
	public void Equals() {
		String s1="Mathew";  
		String s2="Mathew";  
		  
		System.out.println(s1.equals(s2));
	}
	public void Concat() {
		String s1="java";
		
		String s2= s1.concat(" is immutable....");    
		System.out.println(s2);   
	}
	public void replace() {
		String s1="Mathew is a Software Employee";  
		String replaceString=s1.replace('a','e');
		System.out.println(replaceString);
	}
	public void lowercase() {
		String s1="MATHEW a IS SOFTWARE employee";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);  
		
	}
	public void uppercase() {
		String s1="MATHEW a IS SOFTWARE employee";  
		String s1lower=s1.toUpperCase();  
		System.out.println(s1lower); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testing obj = new Testing();
		obj.CharAT();
		obj.Length();
		obj.Substring();
		obj.Equals();
		obj.Concat();
		obj.replace();
		obj.lowercase();
		obj.uppercase();
		
	}

}
