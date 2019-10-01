package HomeWork1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class D {
	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		
		System.out.print("Enter value of a:");
		int a = ui.nextInt();
		
		System.out.print("Enter value of b:");
		int b = ui.nextInt();
		
		if(a > b) {
			int temp = a;
			
			a = b;
			b = temp;
		}
		
		int odd = 0;
		int even = 0;
		
		int oddSum = 0;
		int evenSum = 0;
		
		System.out.println("\nRandom numbers between " + a + " and " + b + ":");
		for(int i=0; i < 40; i++) {
			int rand = ThreadLocalRandom.current().nextInt(a, b + 1);
			
			if(rand % 2 == 0) {
				even += 1;
				evenSum += rand;
				System.out.println(rand);
			}
			else {
				odd += 1;
				oddSum += rand;
				System.out.println(rand);
			}
		}
		
		System.out.println("\nOdd: " + odd + "\n" + "Even: " + even);
		System.out.println("\nSum of odd numbers: " + oddSum + "\n" + "Sum of even numbers: " + evenSum);
		
		if(oddSum > evenSum) {
			int temp = oddSum;
			
			oddSum = evenSum;
			evenSum = temp;
		}
		
		System.out.println("\nRandom numbers between " + oddSum + " and " + evenSum + ":");
		for(int i=0; i < 5; i++) {
			int rand = ThreadLocalRandom.current().nextInt(oddSum, evenSum + 1);
			
			System.out.println(rand);
		}
	}
}