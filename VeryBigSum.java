import java.math.BigInteger;
import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long sum=0;
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]= scan.nextInt();
			sum+=ar[i];
		}System.out.println(sum);
		
	}

}
