import java.util.Arrays;
import java.util.Scanner;

public class LargSmalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter value");
		for (int i = 0; i < n; i++) {
			a[i]= scan.nextInt();
		}			
		Arrays.sort(a);
			System.out.println("The Largest value"+a[a.length-1]);
			System.out.println("The Smallest value"+a[0]);
	

	}

}
