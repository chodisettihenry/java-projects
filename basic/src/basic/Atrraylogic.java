package basic;

public class Atrraylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][];
		a[0]=new int[2];
		a[1]=new int[9];
		a[2]= new int[12];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				a[i][j]= (int)(Math.random()*10);
			}
		}System.out.println();
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
