package pack1;
import java.util.Scanner;
public class VowelorConsonantChecker {
	public void method1() {
	Scanner scan=new Scanner(System.in);
	
		System.out.println("Vowel or Constant Checker");
		System.out.println("Enter a Alphabet Character:");
		char  ch=scan.next().charAt(0);
	
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			switch(ch)
			{
			case 'a':
			{
				System.out.println(ch+" is vowel");
				break;
			}
			case 'e':
			{
				System.out.println(ch+" is vowel");
				break;
			}
			case 'i':
			{
				System.out.println(ch+" is vowel");
				break;
			}
			case 'o':
			{
				System.out.println(ch+" is vowel");
				break;
			}
			case 'u':
			{
				System.out.println(ch+" is vowel");
				break;
			}
			default:
			{
				System.out.println(ch+" is Constant");
				break;
			}
			
			
			}
		 
				
			}
		
		else {
		
			System.out.println("Invalid input. Not an alphabet");
			
		}
		
		
			}
			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			VowelorConsonantChecker obj=new VowelorConsonantChecker();
			obj.method1();

	}

}
