import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String b ="abcdefghijklmnopqrstuvwxyz";
		String a = scan.nextLine().toLowerCase();
		char ch[] = a.toCharArray();
		Arrays.sort(ch);
		a = new String(ch);
		if(a.contains(b)){
			System.out.println("Pangram");
		}
		else{
			System.out.println("Not Pangram");
		}
		
	}

}
