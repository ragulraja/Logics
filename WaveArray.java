import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= scan.nextInt();
		}
		Arrays.sort(a);
		if(a.length%2==0){
		for (int i = 0; i < a.length; i+=2) {
			int temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
			System.out.print(a[i]+" "+a[i+1]+" ");
		}
		}else{
			for (int i = 0; i <a.length-1; i+=2) {
				int temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
				System.out.print(a[i]+" "+a[i+1]+" ");
			}
			System.out.print(a[a.length-1]);
		}
	
		
	}

}
