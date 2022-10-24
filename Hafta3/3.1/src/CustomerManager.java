
public class CustomerManager {

	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this._creditManager = creditManager;
	}

	public void Save() {

		System.out.println("Müşteri Kaydedildi : ");
	}

	public void Delete() {

		System.out.println("Müşteri Silindi : ");
	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi...");
	}

}
