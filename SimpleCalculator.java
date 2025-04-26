package pack1;
import java.util.Scanner;
public class SimpleCalculator {
	Scanner scan=new Scanner(System.in);
	public void calculation()
	{
		System.out.println("Simple Calculator");
		System.out.println("Operations:+,-,*,/");
		System.out.println("Enter first Number:");
		int a=scan.nextInt();
		System.out.println("Enter second Number:");
		int b=scan.nextInt();
		System.out.println("Enter  operator:");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		case '+':
		{
			System.out.println("A+B:"+(a+b));
			break;
		}
		case '-':
		{
			System.out.println("A-B:"+(a-b));
			break;
		}
		case '*':
		{
			System.out.println("A*B:"+(a*b));
			break;
		}
		case '/':
		{
			System.out.println("A/B:"+(a/b));
			break;
		}
		default :{
			System.out.println("invalid input");
		}
		
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator obj=new SimpleCalculator();
		obj.calculation();

	}

}
