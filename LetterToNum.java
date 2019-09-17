import java.util.Scanner;

public class LetterToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		//int s = scan.nextInt();
		String s1 = scan.nextLine();
		String a ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(a.indexOf(s1));
	}

}
