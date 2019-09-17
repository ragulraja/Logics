import java.util.Scanner;

public class FindNumberGreeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		 a[i] = scan.nextInt();
		}
		int b = scan.nextInt();
		int flag =-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b){
				flag =i;
			}
		}
			if(flag>=0){
				System.out.println(flag);
			}
			else{
				System.out.println(-1);
				//break;
			}
			
		}
}
