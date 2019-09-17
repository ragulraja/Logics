import java.util.Scanner;

public class Add2ArrayGreeks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		 a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int b[] = new int[m];
		for (int i = 0; i < m; i++) {
		 b[i] = scan.nextInt();
		}
		String s =null;
		String s5 = null;
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < a.length; j++) {
			 s =sb.append(a[j]).toString();
		}
		//System.out.println(sb);
		StringBuffer s1 = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			s5 =s1.append(b[i]).toString();
		}
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s5));
		
		
	}
}