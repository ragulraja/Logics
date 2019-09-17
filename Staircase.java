import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int a = scan.nextInt();
		for (int i = 0; i <=a; i++) {
			for(int j=i;j<=i;j++){
			System.out.print(" ");
			}
			for(int k = 0; k <=i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}

