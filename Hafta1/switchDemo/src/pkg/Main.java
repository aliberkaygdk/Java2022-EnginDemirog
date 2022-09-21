package pkg;

public class Main {

	public static void main(String[] args) {
		char grade='C';
		//=
		switch (grade) {
			case 'A': 
				System.out.println("Mükemmel : Geçer");
				break;
			case 'B':
				System.out.println("Çok Güzel : Geçer");
				break;
			case 'C':
				System.out.println("İyi : Geçer");
				break;
			case 'D':
				System.out.println("Fena Degil : Geçer");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
			default:
				System.out.println("Geçersiz not girdiniz");
			
		}

	}

}
