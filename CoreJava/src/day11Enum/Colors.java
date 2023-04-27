package day11Enum;

import java.util.Scanner;

public enum Colors implements Interface1
{
	black(0,null,0),
	white(0,null,0),
	read(0,null,0),
	blue(0,null,0),
	green(0,null,0),
	silver(0,null,0);
	
	Scanner sc= new Scanner(System.in);
	private int id;
	private String name;
	private double weight;
	
	public void display()
	{
		System.out.println("display method");
	}
	private Colors(int id,String name,double weight)
	{
		
		System.out.println("paramter constructor 3");
	}
	
	public void setInfo()
	{
		System.out.println("Enter id name and weight: ");
		this.id=sc.nextInt();
		this.name=sc.next();
		this.weight=sc.nextDouble();
	}
	
	
	public String toString()
	{
		return "name: "+name()+" id:"+id+" name:"+name+" weight:"+weight;
	}
	
	
}
