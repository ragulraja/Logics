import java.util.Scanner;

public class OddNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for (int i = a; i <=b; i++) {
			if(i % 2 == 1){
				System.out.println(i);
			}
		}
	}

}
