import java.util.Scanner;

public class Array2dimAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row size");
		int r = scan.nextInt();
		System.out.println("Enter coloum size");
		int c = scan.nextInt();
		System.out.println("Enter row2 size");
		int a = scan.nextInt();
		System.out.println("Enter coloum2 size");
		int b = scan.nextInt();
		int m[][] = new int[r][c];
		int n[][] = new int[a][b];
		int d[][] = new int[r][c];
		System.out.println("Enter Array1 values");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j]=scan.nextInt();
			}

		}
		System.out.println("Enter Array2 vaues");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[i][j]=scan.nextInt();
			}
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				d[i][j]=m[i][j]+n[i][j];
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(+d[i][j]+" ");
			}System.out.println("");
			
		}
		
	}

}
