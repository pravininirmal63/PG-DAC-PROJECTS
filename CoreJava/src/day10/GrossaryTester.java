package day10;

import java.util.Scanner;

public class GrossaryTester {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	catogory[] c = catogory.values();
	GrossaryShop[] g = new GrossaryShop[4];
	int ch=0;
	catogory d=null;
	int index=0;
	System.out.println("1.ADD products: ");
	System.out.println("2.display all products");
	System.out.println("3.show specific products by id ");
	System.out.println("4.show all products price>100 ");
	System.out.println("5.chose product from user and show only matches product ");
	do
	{
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			for(catogory e:c)
			{
				System.out.print(e+" ");
			}
			System.out.println();
			System.out.println("Enter choice: ");
			d=catogory.valueOf(sc.next().toLowerCase());
			switch(d)
			{
			case soda:
				System.out.println("Enter");
				g[index]=new GrossaryShop(10,"abc",40.00,catogory.soda);
				System.out.println("Addded");
				break;
			case eggs:
				g[index]=new GrossaryShop(11,"bbc",150.00,catogory.eggs);
				System.out.println("Addded");
				break;
			case breads:
				g[index]=new GrossaryShop(12,"abb",143.00,catogory.breads);
				System.out.println("Addded");
				break;
			case milk:
				g[index]=new GrossaryShop(13,"cba",67.00,catogory.milk);
				System.out.println("Addded");
				break;	
			}
			index++;
			break;
				
		case 2:
			
			for(GrossaryShop f:g)
			{
				if(f!=null)
				{
					System.out.println(f);					
				}
			}
			break;
			
		case 3:
			System.out.println("Enter id to get details: ");
			int ids=sc.nextInt();
			for(int i=0;i<index;i++)
			{
				if(g[i].getId()==ids)
				{
					System.out.println(g[i]);
				}
			}
			break;
			
		case 4:
			for(int i=0;i<index;i++) 
			{
				if(g[i].getPrice()>100)
				{
					System.out.println(g[i]);
				}
			}
			break;
						
		case 5:
			System.out.println("Enter product catogory to show product: ");
			for(catogory e:c)
			{
				System.out.print(e+" ");
			}
			System.out.println();
			System.out.println("Enter choice: ");
			d=catogory.valueOf(sc.next().toLowerCase());
			
			for(int i=0;i<index;i++)
			{
				if(d==g[i].getCat())
				{
					System.out.println(g[i]);
				}
			}
			
			break;
			
		}
		
		}while(ch!=6);
	}
}
