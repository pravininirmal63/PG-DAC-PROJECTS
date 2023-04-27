package com.app.tester;
import java.util.Scanner;

import com.app.fruits.*;
public class FruitBasket {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Mention Basket size: ");
		Fruit[] f = new Fruit[sc.nextInt()];
		
		System.out.println("1. Add Mango\r\n"
				+ "2. Add Orange\r\n"
				+ "3. Add Apple\r\n"
				+ "4. Display names of fruits\r\n"
				+ "5. Display details and taste fresh fruits in the basket\r\n"
				+ "6. Mark a fruit in a basket , as stale(=not fresh\r\n"
				+ "7. Mark all sour fruits stale\r\n"
				+ "8. get fruit specific functionality (pulp / juice / jam)");
		int ch=0;
		int count=0;
		do
		{
			System.out.println("Please enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(count<f.length)
				{
					System.out.println("Enter color weight and name: ");
					f[count++]=new Mango(sc.next(),sc.nextDouble(),sc.next());
				}
				else
				{
					System.out.println("Basket is Full...!");
				}
				break;
			case 2:
				if(count<f.length)
				{
					System.out.println("Enter color weight and name: ");
					f[count++]=new Orange(sc.next(),sc.nextDouble(),sc.next());
				}
				else
				{
					System.out.println("Basket is Full...!");
				}
				break;
			case 3:
				if(count<f.length)
				{
					System.out.println("Enter color weight and name: ");
					f[count++]=new Apple(sc.next(),sc.nextDouble(),sc.next());
				}
				else
				{
					System.out.println("Basket is Full...!");
				}
				break;
			case 4:
				for(Fruit e:f)
				{
					if(e!=null)
					{
						System.out.println(e.getName());
					}
				}
				break;
			case 5:
				for(Fruit e:f)
				{
					if(e!=null)
					{
						System.out.println(e);
						System.out.println("taste is :"+e.taste());
					}
				}
				break;
				
			case 6:
				System.out.println("Enter fruit(index) number to mark as a stale: ");
				
				int b=sc.nextInt();
				b-=1;
				if(f[b]!=null)
				{
					f[b].setFresh(false);
				}
				else
					System.out.println("invalid index");
				break;
			case 7:
				for(Fruit e:f)
				{
					if(e!=null && e.taste().equals("sour"))
					{
						e.setFresh(false);
					}
				}
				System.out.println("all Sour fruits now stale...!");
				break;
				
			case 8:
				System.out.println("Enter fruit(index) number to call specific functionality: ");
				b=sc.nextInt();
				b-=1;
				if(f[b]!=null)
				{
					if(f[b] instanceof Apple)
					{
						((Apple)f[b]).jam();
					}
					else if(f[b] instanceof Orange)
					{
						((Orange)f[b]).juice();
					}
					else if(f[b] instanceof Mango)
					{
						((Mango)f[b]).pulp();
					}
					
				}
				else
				{
					System.out.println("not to much fruit available...!");
				}
				break;
				
				default:
					System.out.println("Invalid choice.....!");
					break;
			}
		}while(ch<9);
		

	}

}
