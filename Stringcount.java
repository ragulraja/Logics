import java.util.Scanner;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count =0;
		System.out.println("Enter String");
		String s = scan.nextLine();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if((ch[i]==ch[j])){
					count++;
				}
			}
		}System.out.println(count);
		
	}

}
