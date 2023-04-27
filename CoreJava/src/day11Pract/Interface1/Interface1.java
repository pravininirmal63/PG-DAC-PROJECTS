package day11Pract.Interface1;

public interface Interface1 
{
	 void method1() ;
	 void method2();
	 default void method3()
	{
		System.out.println("new mwthod3 need to be implement");
	}
	
}
