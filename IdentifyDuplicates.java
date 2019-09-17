import java.util.Scanner;

public class IdentifyDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		String temp="";
		char ch[] = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]){
				temp+=ch[i];
				}
			}
		}
		System.out.println(temp);
	}

}
