package HomeWork1;
import java.util.Scanner;


public class B extends A {
	int y;
	
	public void setValueOfy() {
		Scanner ui = new Scanner(System.in);
		
		System.out.print("Enter value of y: ");
		y = ui.nextInt();
	}
	
	public int sum() {
		return x + y;
	}
}