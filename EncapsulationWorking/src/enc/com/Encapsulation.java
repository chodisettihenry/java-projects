package enc.com;

public class Encapsulation {
	private int age;
	private String name;
	
	public void setage(int age) {
		this.age=age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
    Encapsulation(){
    	this.age=age;
    	this.name=name;
    	
    }
   
	public String toString() {
    	return "age "+age+"name "+name;
    
    }
    public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setage(20);
		obj.setname("ganesh");
		System.out.println(obj.getage());
		System.out.println(obj.getname());
	}
}
