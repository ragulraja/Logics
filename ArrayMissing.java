import java.util.Scanner;

public class ArrayMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count =0,sum =0;
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]==a[j])){
					a[j]=0;
					a[i]=0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
