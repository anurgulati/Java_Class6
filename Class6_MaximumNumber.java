import java.util.Scanner;

public class Class6_MaximumNumber {

	public static void main(String args[])
	{
		int a,b;
		String s1,s2;
		Scanner anur=new Scanner(System.in);
		System.out.println("Enter first String");
		s1=anur.next();
		System.out.println("Enter second String");
		s2=anur.next();
		a=Integer.valueOf(s1);
		b=Integer.valueOf(s2);
		if (a>b)
		{
			System.out.println("greater number is " + a);
		}
		else
			System.out.println("greater number is " + b);
		
	}
}
