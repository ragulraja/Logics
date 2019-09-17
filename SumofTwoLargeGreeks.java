import java.math.BigInteger;
import java.util.Scanner;

public class SumofTwoLargeGreeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while(a-->0){
		BigInteger x = scan.nextBigInteger();
		String s=x.toString();
        BigInteger y = scan.nextBigInteger();
		BigInteger sum = x.add(y);
		String z=sum.toString();
		//System.out.println(sum);
		if(z.length()==(s.length())){
			System.out.println(sum);
		}
		else{
			System.out.println(x);
		}
	}
	

}

}