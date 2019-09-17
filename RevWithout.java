import java.util.Scanner;

public class RevWithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String rev="";
		String s = scan.nextLine();
		for (int i = s.length()-1; i>=0; i--) {
			rev+=String.valueOf(s.charAt(i));
		}
		System.out.println(rev);
	}

}
