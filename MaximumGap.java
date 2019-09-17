import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
		int diff = 0;
		int n = scan.nextInt();
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] =scan.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i <  a.length-1; i++) {
			if(Math.abs(a[i]-a[i+1])>diff){
			diff=Math.abs(a[i]-a[i+1]);
			}
		}
		System.out.println(diff);
	}

}
}