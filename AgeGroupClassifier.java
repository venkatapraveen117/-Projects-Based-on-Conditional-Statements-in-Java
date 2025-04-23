package pack2;
import java.util.Scanner;

public class AgeGroupClassifier {
	Scanner scan=new Scanner(System.in);
	public void method1()
	{
		System.out.println("Welcome to  Age_Group_Classifier");
		System.out.println("Enter your age to classify  into an appropriate age group:");
		int age=scan.nextInt();
		if(age>=0 && age<=12)
		{
			System.out.println("You are a child");
		}
		else if(age>=13 && age<=17)
		{
			System.out.println("You are a Teenager");
			
		}
		else if(age>=18 && age<=35)
		{
			System.out.println("You are a Young_Adult");
		}
		else if(age>=36 && age<=59)
		{
			System.out.println("You are a Adult");
		}
		else {
			System.out.println("You are a Senior Citizen");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeGroupClassifier obj=new AgeGroupClassifier();
		obj.method1();

	}

}
