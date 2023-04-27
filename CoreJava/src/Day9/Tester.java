package Day9;

import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student[] s= new Student[3];
		Menu[] m= Menu.values();
		int index=0;
		for(Menu n:m)
		{
			System.out.println(n);
		}
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter option: ");
			Menu ch=Menu.valueOf(sc.next().toLowerCase());		
			
			switch(ch)
			{
			case add_student:
				if(index<3)
				{
					int count=0;
					System.out.println("Enter Rollno,name,address and course:");
					int rollno=sc.nextInt();
					String name=sc.next();
					for(i=0;i<index;i++)
					{
						if(rollno==s[i].getRollno() && name.equals(s[i].getCname()))
						{
							count++;
						}
					}
						if(count==0)
						{
							s[index]=new Student(rollno,name,sc.next(),sc.next());
							index++;
						}
						else
						{
							System.out.println("cannot add due to same added before");
						}
					
				}
				break;
				
			case edit_address:
				System.out.println("Enter which rolls no want to change address:");
				int rollno=sc.nextInt();
				for(i=0;i<index;i++)
				{
					if(rollno==s[i].getRollno())
					{
						System.out.println("Enter new address to change:");
						s[i].setAddress(sc.next());
					}
				}
				
				break;
				
				
			case display:
				for(i=0;i<index;i++) {
					System.out.println(s[i]);
				}
				
				break;
			
			
			
			}
			
			
			
		}
	}
}
