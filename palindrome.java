import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		StringBuffer sb = new StringBuffer(s);
		String b = sb.reverse().toString();
		System.out.println(b);
		if(s.equals(b)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
	}

}
