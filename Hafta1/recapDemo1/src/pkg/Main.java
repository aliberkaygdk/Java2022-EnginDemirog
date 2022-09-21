package pkg;

public class Main {

	public static void main(String[] args) {
		int sayi1=266;
		int sayi2=2555;
		int sayi3=2666;
		int enBuyuk = 0;
		//videodaki örnegi kendimce biraz duzelttim
		
		if(sayi1<sayi2	&&	sayi3<sayi2)
			enBuyuk=sayi2;
		
		else if(sayi1<sayi3&&sayi2<sayi3)
			enBuyuk=sayi3;
		
		else
			enBuyuk=sayi1;
		
		System.out.println("En Büyük = "+enBuyuk);
	}

}
