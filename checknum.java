import java.io.*;
import java.util.*;
class checknum
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		if(n>0)
		{
			System.out.println("Positive number");
		}
		else if(n==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
	}
