package day11Enum;

public class Tester 
{
	public static void main(String[] args) {
		
		Colors[] c= Colors.values();
		
		Colors d= Colors.black;
		d.setInfo();;
		System.out.println(d.name());
		System.out.println(d);
	}
	
}
