import java.util.Scanner;

public class Print5s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=0;
		System.out.println("Enter No");
		int n=scan.nextInt();
		for (int i = 1; i < n; i++) {
		if(i%10==1||i%10==2||i%10==3||i%10==4||i%10==5){
			System.out.print(i+" ");	

		}
		}
	}

}
