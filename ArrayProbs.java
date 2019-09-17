import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayProbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = scan.nextInt();
		int total=0;
		System.out.println("Enter value");
		int a[] =new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i]= scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			 total+=a[i];
		}
		for (int i = 0; i < n; i++) {
			a[i]=total-a[i];
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("Minimum value="+a[0]);
		System.out.println("Maximum Value="+a[a.length-1]);
		
	}

}
