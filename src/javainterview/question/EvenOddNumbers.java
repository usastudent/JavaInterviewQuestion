package javainterview.question;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		for (int i = 0; i <100; i++) {
			
			isEvenOrOdd(i);
		}
		isEvenOrOdd(18);
		

	}

	public static void isEvenOrOdd(int num) {
		if (num % 2 ==0) {
			System.out.println(num+" is an Even Number");
		} else {
			System.out.println(num+" is an Odd Number");
		}
	}
}
