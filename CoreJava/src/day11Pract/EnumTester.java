package day11Pract;

public class EnumTester 
{
	public static void main(String[] args) {
		
		for(Colors a: Colors.values())
		{
			System.out.print(a+" ");
		}
		
		Colors c=Colors.grey;
		System.out.println(c);
		
		Colors d= Colors.white;
		System.out.println(d);
		
		Colors e= Colors.blue;
		
		System.out.println(e.getPrice());
		e.setPrice(152);
		System.out.println(e.getPrice());
		System.out.println(e.name());
		System.out.println(e.ordinal());
		System.out.println(e.getClass());
		
		
		
		
		
	}

}
