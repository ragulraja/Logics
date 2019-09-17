import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringProbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = scan.nextLine();
		String a1="";
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i++){
			a=String.valueOf(c[i]); 
		if(!a1.contains(a)){
			a1+=a;
		}
			
	}
		System.out.println(a1);
		
	}

}
