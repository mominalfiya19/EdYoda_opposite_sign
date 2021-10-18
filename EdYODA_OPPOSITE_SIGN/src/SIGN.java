import java.util.Scanner;
public class SIGN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first numbers");
		int a=sc.nextInt();
		
		System.out.println("Enter Second numbers");
		int b=sc.nextInt();
		
		if(a*b>0)
		{
			System.out.println("both the numbers is having same sign");
	    }
		
		else
		{
			System.out.println("both the numbers is having opposite sign");
		}
		
		
		
		
	}

}
