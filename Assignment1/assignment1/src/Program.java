import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numer :: ");
		n=sc.nextInt();
		System.out.println("Number n = "+n);
		
		System.out.println("num to binary is::"+Integer.toBinaryString(n));
		System.out.println("num to octal is::"+Integer.toOctalString(n));
		System.out.println("num to hexadecimal is::"+Integer.toHexString(n));
		
	}

}
