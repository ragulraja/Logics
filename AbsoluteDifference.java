import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rs = scan.nextInt();
		int cs = scan.nextInt();
		int sum=0,sum1=0;
		int ar[][] = new int[rs][cs];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = scan.nextInt();	
			}
			
		}
		for (int i = 0,j=0; i < ar.length; i++,j++) {
				sum+=ar[i][j];
		}
			for (int j =ar.length-1,i=0; j>=0; j--,i++) {
				sum1+=ar[i][j];
		}
		
		System.out.println(Math.abs(sum-sum1));
	}

}
