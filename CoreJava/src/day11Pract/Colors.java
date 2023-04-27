package day11Pract;

public enum Colors {
	red(10),white(20,3),grey(30),blue(40,5),green(50,6);
	
	private int price;
	private int id;
	
	private Colors(int price,int id)
	{
		System.out.println("--two paramter--");
		this.price=price;
		this.id=id;
	}
	private Colors(int price)
	{
		System.out.println("--one paramter--");
		this.price=price;	
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getId()
	{
		return id;
	}
	@Override
	public String toString()
	{
		return "price: "+price+" id:"+id;
	}
	
	public void setPrice(int a)
	{
		this.price=a;
	}
}
