package Enc.com;

public class Enca {
	private int a;
    public void Checking(int a) {
    	if(a>1&&a<2)
    	{
    		this.a=a;
    		}
    	else {
    		System.out.println("this error");
    	}
    }
    public int nextmethod(int a) {
    	
    	return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enca obj= new Enca();
	
		obj.nextmethod(70);
		System.out.println(obj);
		

	}

}
