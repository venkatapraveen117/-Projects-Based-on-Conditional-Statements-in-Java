package pack1;
import java.util.Scanner;
public class DayofTheWeek {
	Scanner scan=new Scanner(System.in);
	public void m1()
	{
		System.out.println("Day of the Week");
		System.out.println("Enter the  Number from 1 to 7 ");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("Monday");
			break;
	     }
		case 2:
		{
			System.out.println("Tuesday");
			break;
	     }
		case 3:
		{
			System.out.println("Wednsday");
			break;
	     }
		case 4:
		{
			System.out.println("Thursday");
			break;
	     }
		case 5:
		{
			System.out.println("Friday");
			break;
	     }
		case 6:
		{
			System.out.println("Saturday");
			break;
	     }
		case 7:
		{
			System.out.println("Sunday");
			break;
	     }
		default:
		{
			System.out.println("Invalid Input");
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayofTheWeek obj=new DayofTheWeek();
		obj.m1();
		

	}

}
