import java.util.Scanner;

public class PowerCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
		long a = scan.nextLong();
		int b = scan.nextInt();
		System.out.println((int)Math.pow(a, b));
	}

}
}

