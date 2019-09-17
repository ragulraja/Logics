import java.util.Scanner;

public class NambiyarNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=true;
		StringBuffer add=new StringBuffer();
			for(int i=0;i<s.length();i++){
			String ch=String.valueOf(s.charAt(i));
				int n=Integer.parseInt(ch);
				
			int n1=n%2==0?0:1;
			
				int s1=n;
				int j=i+1;
				
			if(j==s.length()){
				add.append(n);
				break;
				}
			while(b){
				s1+=Integer.parseInt(String.valueOf(s.charAt(j++)));
			if(s1%2!=n1||j>=s.length()){
				add.append(s1);
				i=j-1;
			break;
			}
				}
			}
			int output=Integer.valueOf(String.valueOf(add));
			System.out.println(output);
			

	}

}
