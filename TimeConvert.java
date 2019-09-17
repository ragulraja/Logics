import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//String a = scan.nextLine();
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss a");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss");
	       String date = scan.nextLine();
	       System.out.println(displayFormat.format(date));
	   }
	}


