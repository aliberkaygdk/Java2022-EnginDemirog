package pkg;

public class Main {
//ctrl+shift+F düzen kombosu
	public static void main(String[] args) {
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			// şartta tek satırlık işlemde parantez gerekmiyor
			if (max < number)
				max = number;
			total += number;
			System.out.println(number);
		}

		System.out.println("Toplam= " + total);
		System.out.println("En Büyük= " + max);
	}

}
