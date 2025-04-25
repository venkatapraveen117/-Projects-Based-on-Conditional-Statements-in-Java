package pack1;
import java.util.Scanner;
public class LeapYearChecker {
	Scanner scan=new Scanner(System.in);
  static	int year;
	public void check(int no)
	{
		System.out.println("Leap Year Checker");
		System.out.println("Enter year:");
		year=scan.nextInt();
		if((year%4==0 && year%100!=0 ) || year%400==0)
		{
			System.out.println( year +" is a Leap Year");
		}
		else
		{
			System.out.println( year +" : is not a Leap Year");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYearChecker  obj=new LeapYearChecker();
		obj.check(year);

	}

}
