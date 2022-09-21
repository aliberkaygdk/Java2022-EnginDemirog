package pkg;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		//int remainder = number % 2;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("sayi asal degil");
			return;
		}
		if (number < 1) {
			System.out.println("gecersiz sayi aralıgı");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				isPrime = false;
		}
		if (isPrime)
			System.out.println("sayi asal");
		else
			System.out.println("sayi asal degil");

	}
}
