/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s="";
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		StringBuffer ss=sb.reverse();
		System.out.println(ss);
		
	}
}
