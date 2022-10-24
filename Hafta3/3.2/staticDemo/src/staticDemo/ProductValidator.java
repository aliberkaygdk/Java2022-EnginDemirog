package staticDemo;

public class ProductValidator {
	
	//Yapıcı bloklar newleyince çalışır
	//C# da statick iken de çalışır
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	static {
		System.out.println("Statick olan yapıcı blok çalıştı");
	}
	
	
	public static boolean isValid(Product product) {
		
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	public void bisey() {
		
	}
	
	//inner class
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
	
}
