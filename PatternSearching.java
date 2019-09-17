import java.util.Scanner;

public class PatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		while(a1-->0){
		String a = scan.next();
		String b = scan.next();
				if(a.contains(b)){
					System.out.println("found");
				}
				else{
					System.out.println("not found");
				}
			}
}
	
}