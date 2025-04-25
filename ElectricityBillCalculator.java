package pack1;
import java.util.Scanner;
public class ElectricityBillCalculator {
	Scanner scan=new Scanner(System.in);
	public void m1()
	{
		System.out.println("Welcome to Electricity-Bill-Calculator");
		System.out.println(" Rate increases with usage");
		System.out.println("Units(kWh)   Rate per Unit");
		System.out.println("0-100     ₹1.50 ");
		System.out.println("101-300     ₹2.50 ");
		System.out.println("301-500     ₹4.50 ");
		System.out.println("501+     ₹6.50 ");
		System.out.println("Enter total  units Consumed");
		int units=scan.nextInt();
		switch(units/100)
		{
		case 0:
		{
			System.out.println("₹"+units*1.50);
	        break;
		}
		case 1:
		{
			System.out.println("₹"+units*2.50);
	       
	        break;
		}
	    case 2:
	    {
	    	System.out.println("₹"+units*2.50);
	        break;
	    }
	    case 3:
	    {
	    	System.out.println("₹"+units*4.50);
	        break;
	    }
	    case 4:
	    {
	    	System.out.println("₹"+units*4.50);
	        break;
	    }
	    case 5:
	    {
	    	System.out.println("₹"+units*4.50);
	        break;
	    }
	    case 6:
	    {
	    	if(units>=501)
	    	{
	    		System.out.println("₹"+units*6.50);
	    	}
	    	
	        break;
	    }
	    
	    
	    
	    default:
	       
	        break;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBillCalculator obj=new ElectricityBillCalculator();
		obj.m1();

	}

}
