package pkg;

public class Main {

	public static void main(String[] args) {

		String mesaj = "   Bugün hava çok güzel.";
		System.out.println(mesaj);

		// String1
		System.out.println("Eleman sayısı " + mesaj.length());
		System.out.println("Besinci eleman " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("----------------------");

		// String2
		System.out.println(mesaj.replace(' ', '+'));
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}

}
