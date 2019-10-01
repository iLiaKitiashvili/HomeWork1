package HomeWork1;
import java.util.Scanner;


public class A {
	static int x;
	
	public A() {
		System.out.println("Hello");
	}
	
	public void setValueOfx() {
		Scanner ui = new Scanner(System.in);
		
		System.out.print("Enter value of x: ");
		x = ui.nextInt();
	}
	
	public void addition() {
		System.out.println(x + 12);
	}
	
	public void oddOrEven() {
		if(x % 2 == 0) {
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}