import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumofMiddleEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[a.length+b.length];
		for (int i = 0; i < c.length; i++) {
			c[i]=scan.nextInt();
		}
		Arrays.sort(c);
		System.out.println(c[n]);
		System.out.println(c[n-1]+c[n]);
	}

}

}