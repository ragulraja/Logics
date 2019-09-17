import java.util.Scanner;

public class RemoveDupGreeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String st[] = s.split(" ");
		String output ="";
		
		for (int i = 0; i < st.length; i++) {
			String s1 = st[i];
			String dup ="";
			for (int j = 0; j < s.length(); j++) {
			if(!(dup.contains(s.charAt(j)+""))){
			dup+=s.charAt(j);
		}
		}
			if(!(output.contains(dup))){
				output+=dup+" ";
			}
			
			
	}
		System.out.println(output);
}
}