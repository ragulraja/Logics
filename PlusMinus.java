import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double count=0,count1=0,count2=0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
		if(a[i]<0){
				count++;
		}
	    if(a[i]>0){
				count1++;
			}
	    if(a[i]==0){
				count2++;	
			} 
		}
		System.out.format("%.6f\n", count1/n);
		System.out.format("%.6f\n", count/n);
		System.out.format("%.6f\n", count2/n);
	}

}
