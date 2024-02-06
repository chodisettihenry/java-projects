package methodRefence.com;
interface methodref{
	public int workingoutput(int a);
}

public class MethodRefernce {
	public static int squareRoot(int b) {
		return b*b;
	}
	public static int cubeRoot(int c) {
		return c*c*c;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodref inter1 = MethodRefernce::squareRoot;
		
		System.out.println(inter1.workingoutput(46));

	}

}
