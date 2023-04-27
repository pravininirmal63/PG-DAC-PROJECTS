package Test;
import java.util.Scanner;

public class TestString 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s="hi everyone how are you";
		char a='o';
		int count=0;
		int i;
		int total=s.length();
		for ( i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==a)
			{
				count++;
				if(count==2)
				{
					System.out.println("count"+count);
					break;
				}
			}
			
		}
		if(count==2)
		{
			System.out.println("last second character found");
			total=total-(total-i);
			System.out.println("position of the "+a+" at "+total+ "position");
		}
		else if(count<2)
		{
			System.out.println("character occurance once");
		}
		else
		{
			System.out.println("character not found");
		}
		
	}
}
