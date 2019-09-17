import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value");
		int n = scan.nextInt();
		 for (int i=0; i<n; i++) 
		 {
			 for (int j=n-i; j>1; j--){
             System.out.print(" "); 
         }  
         for (int j=0; j<=n; j++ ) 
         { 
             System.out.print(" * "); 
         } 

         System.out.println(); 
     } 
}
}