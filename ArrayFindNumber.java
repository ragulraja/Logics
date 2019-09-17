import java.util.Scanner;

public class ArrayFindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter value");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the elements to search");
		int k = scan.nextInt();
		int flag=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==k){
				flag=1;
			}
		
			else {
				flag=2;
			}
		}
		if(flag==1){
			System.out.println("Yes");
		}
		else if(flag==2){
			System.out.println("No");
		}
		
	}

}
