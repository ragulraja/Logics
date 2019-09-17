import java.util.Scanner;

public class NonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int count=0;
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			if(i==0||i==1){
				sum+=arr[i];
			}
			else if(i!=2){
				count=0;
				for(int j=i;j>=1;j--){
					if(i%j==0)
                      count++;	
		      }
		 if(count!=2) sum+=arr[i];
		     System.out.println(sum);
		  }	
	   }

		scan.close();
	}
}

