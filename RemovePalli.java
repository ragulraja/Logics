import java.util.Scanner;

public class RemovePalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		   int n=scan.nextInt();
		   String str="";
		   String str1="";
		   String s1=String.valueOf(n);
		   StringBuffer sb1=new StringBuffer(s1);
		   String s3=String.valueOf(s1);
		   if(s3.equals(s1)){
			   System.out.println("1");
		   }
		   else{
		   for(int i=0;i<s1.length();i++){
		       str1="";
			   str=s1.substring(0,i)+s1.substring(i+1);
			   StringBuffer sb=new StringBuffer(str);
			   str1=String.valueOf(sb.reverse());
		   if(str.equals(str1)){
			    System.out.println();
			}
		  }
		}
			scan.close();
		}
	}