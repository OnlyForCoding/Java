package pack1;

public class ChildClass extends SuperClass{
	
	public int add(int a,int b){
		System.out.println("Chlid class method");
		return a+b;
	}
	
	public static int substract(int a,int b){
		System.out.println("Child class substract method....");
		return a-b;
	}
}
