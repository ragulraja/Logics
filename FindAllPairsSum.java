import java.util.Scanner;

public class FindAllPairsSum {

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
		System.out.println("Enter sum");
		int k= scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]+a[j]==k)){
					System.out.println(a[i]+" "+a[j]);
				}
					}
			}
		}
		
	}

