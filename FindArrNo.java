import java.util.Scanner;

public class FindArrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scan.nextInt();
		int a[] = new int[n];
		String s="";
		System.out.println("Enter value");
		for (int i = 0; i < n; i++) {
			a[i]= scan.nextInt();
			s+=a[i];
		}
		System.out.println("Ente to search");
		int k=scan.nextInt();
			if (s.contains(String.valueOf(k))) {
				System.out.println("YEs");
			}else
				System.out.println("NO");

}
}