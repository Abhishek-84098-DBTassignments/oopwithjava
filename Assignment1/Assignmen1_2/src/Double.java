import java.util.Scanner;

public class Double {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("enter first number a = ");
		
		if(!sc.hasNextDouble()) 
		{
			System.out.println("a is not double...");
			
			return;
		}
			a=sc.nextDouble();
		

		System.out.println("enter second number b = ");
		
		if(!sc.hasNextDouble()) 
		{
			System.out.println("b is not double...");
			
			return;
		}
		
		b=sc.nextDouble();
		
		double avg = (a+b)/2;
		System.out.println("avg is = "+avg);
	}
}
