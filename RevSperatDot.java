import java.util.Iterator;
import java.util.Scanner;

public class RevSperatDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
		String s = scan.nextLine();
		String s1[] = s.split("[.]");
		String rev="";
		for (int i = s1.length-1; i >=0; i--) {
		 rev+=s1[i]+".";
		}
		System.out.println(rev.substring(0,rev.length()-1));
	}

}
}