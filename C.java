package HomeWork1;
import java.util.Scanner;


public class C {
	String a;
	String b;
	String c;
	
	public void setValues() {
		Scanner ui = new Scanner(System.in);
		
		System.out.print("Enter value of a: ");
		a = ui.nextLine();
		
		System.out.print("Enter value of b: ");
		b = ui.nextLine();
		
		System.out.print("Enter value of c: ");
		c = ui.nextLine();
	}
	
	public char lastDigitOfa() {
		return a.charAt(a.length() - 1);
	}
	
	public char firstDigitOfb() {
		return b.charAt(0);
	}
	
	public int sumOfcDigits() {
		int sum = 0;
		
		for(int i=0; i < c.length(); i++) {
			sum += c.charAt(i) - 48;
		}
		
		return sum;
	}
	
	public int multiplyValues() {
		return (lastDigitOfa() - 48) * (firstDigitOfb() - 48);
	}
	
	public void sumValues() {
		System.out.println(sumOfcDigits() + multiplyValues());
	}
}