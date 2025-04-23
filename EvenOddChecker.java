package pack1;
import java.util.Scanner;
public class EvenOddChecker {
	Scanner scan=new Scanner(System.in);
	static int num;
	public void check(int no)
	{
		
		System.out.println("Even Odd Checker");
		System.out.println("Enter number :");
		 num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Number "+num  +"  is Even");
		}
		else
		{
			System.out.println("Number "+num  +"  is Odd");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddChecker  obj=new EvenOddChecker ();
		obj.check(num);
	}

}
