import java.io.*;
import java.util.*;
import java.lang.*;
class alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char s=sc.next().charAt(0);
//System.out.println(s);
if(Character.isAlphabetic(s))
{
System.out.println("alphabet");
}
else
{
System.out.println("not alphabet");
}
}
}
