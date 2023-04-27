package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Anangram 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String 1:");
//	String s1="the more codes";
//	sc.nextLine();
	String s1=sc.nextLine();
	
	System.out.println("Enter the String 1:");
//	String s2="here come dots";
//	sc.nextLine();
	String s2=sc.nextLine();
	
	boolean flag=false;
	char[] a=s1.toCharArray();
	char[] b=s2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	if(s1.length()==s2.length())
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
	}
	else
	{
		flag=false;
	}
	if(flag==true)
	{
		System.out.println("string are Anagram ");
	}
	else
	{
		System.out.println("Strings are not anagram");
	}
}
}
