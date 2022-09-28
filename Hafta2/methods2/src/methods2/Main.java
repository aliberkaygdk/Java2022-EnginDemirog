package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava Cok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(2, 4);
		System.out.println(sayi);
		int toplam = topla2(2, 1, 2, 4, 5, 2);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int s1, int s2) {
		return s1 + s2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;

	}

	public static String sehirVer() {
		return "Ankara";
	}
}
