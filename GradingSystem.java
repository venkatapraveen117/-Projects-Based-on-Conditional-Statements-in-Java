package pack1;
import java.util.Scanner;
public class GradingSystem {
	Scanner scan=new Scanner(System.in);
	public void Subject()
	{
		int total=0;
		String grade="";
		float percentage=0;
		System.out.println("Enter No of Subjects:");
		int no=scan.nextInt();
		int subjects[]=new int[no];
		System.out.println("Enter subjects marks");
		for(int i=0;i<no;i++)
		{
			System.out.println("Subject "+(i+1) +":");
		subjects[i]=scan.nextInt();
	
		}
	System.out.println("check subject marks");
	try {
		for(int i=0;i<no;i++)
		{
			System.out.println("subject "+(i+1) +":"+subjects[i]);
			total +=subjects[i];
			
		}
		percentage = (float) total / (no * 100)* 100 ;

		 }
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	if (percentage >= 90) {
        grade = "A+";
    } else if (percentage >= 80) {
        grade = "A";
    } else if (percentage >= 70) {
        grade = "B";
    } else if (percentage >= 60) {
        grade = "C";
    } else if (percentage >= 50) {
        grade = "D";
    } else {
        grade = "Fail";
    }
	
	
	System.out.println("Total_Marks :"+total);
	System.out.println("percentage:"+percentage+"%");
	System.out.println("grade:"+grade);
	
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradingSystem obj=new GradingSystem();
		obj.Subject();
		

	}

}
