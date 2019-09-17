import java.util.Scanner;

public class DupliRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		String x="";
		///char ch[] = a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			if(!x.contains(String.valueOf(a.charAt(i)))){
				x+=a.charAt(i);
			}
		}System.out.println(x);
		
	}

}
