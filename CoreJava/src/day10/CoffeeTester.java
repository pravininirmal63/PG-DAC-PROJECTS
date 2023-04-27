package day10;

import java.util.Scanner;

public class CoffeeTester {
public static void main(String[] args) {
	Coffee[] c= Coffee.values();
	for(Coffee cf:c)
	{
		System.out.println(cf);
		
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("enter choice:" );
	Coffee d=Coffee.valueOf(sc.next().toLowerCase());
	
	switch(d)
	{
	case black_coffe:System.out.println("balk coffe");
		break;
	case mocha:System.out.println("mocha coffe");
		break;
	case americano:System.out.println("americanno coffe");
		break;
	case cappuccino:System.out.println("cappuccino coffe");
		break;
	case flat_white:System.out.println("falt white coffe");
		break;
		
	}	
	}
}
