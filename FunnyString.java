import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine(),temp=" ";
		for (int i = a.length()-1; i>=0; i--) {
			temp+=String.valueOf((a.charAt(i)));
		}
		//System.out.println(temp);
		int flag=0;
		for(int i=0,j=0;j<a.length()-1&&i<temp.length()-1;i++,j++){
			int t1,t2;
			t1=temp.charAt(i)-temp.charAt(i+1);
			t2=a.charAt(j+1)-a.charAt(j);
			System.out.println(t1+" "+t2);
			if(t1!=t2){
				System.out.println("Not Funny");
			flag=1;
			break;
			}
		}
		if(flag==0) System.out.print("Funny");
	}

}
