import java.util.Scanner;

public class EveryElementOccursGreeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
			int n = scan.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			int res = a[0];
			for (int i = 1; i < n; i++) 
	            res = res ^ a[i]; 
			System.out.println(res);
					}
				}
			
			
		}


