package com.app.fruits;

public class Mango extends Fruit 
{
	public Mango(String color, double weight, String name)
	{
		super(color,weight,name);
		
	}
	@Override
	public String taste()
	{
		return "sweet";
	}
	
	public void pulp()
	{
		System.out.println("name: "+getName()+ ", color: "+getColor()+ "\nCreating Pulp....!" );	
	}
}
