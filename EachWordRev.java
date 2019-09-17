import java.util.Scanner;

public class EachWordRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1[] = s.split(" ");
		String rev=" ";
		for (int i = 0; i < s1.length; i++) {
			String str=s1[i];
			for (int j = str.length()-1; j>=0 ; j--) {
				rev+=str.charAt(j);
				//System.out.println(j);
			}
		}
		System.out.println(rev+" ");
	}

}
