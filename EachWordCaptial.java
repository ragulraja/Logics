import java.util.Scanner;

public class EachWordCaptial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String str[] = s.split(" ");
		
		for(String a:str){
			String w = a.substring(0, 1);
			String w1 = a.substring(1);
			 String b= w.toUpperCase()+w1;
			System.out.print(b+" ");
			
		}
	}

}
