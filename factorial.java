import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n--;
			
		}
		System.out.println(fact);
	}
}
