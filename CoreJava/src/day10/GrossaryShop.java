package day10;

public class GrossaryShop {
	private int id;
	private String name;
	private double price;
	private catogory cat;
	
	public int getId() {
		return id;
	}

	public catogory getCat() {
		return cat;
	}

	public double getPrice() {
		return price;
	}

	public GrossaryShop(int id, String name, double price, catogory cat) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cat = cat;
	}
	
	@Override
	public String toString() {
		return "GrossaryShop [id=" + id + ", name=" + name + ", price=" + price + ", cat=" + cat + "]";
	}
		
}
