package week3.day2;

public abstract class FindPrices implements PetrolPrice {

	public float getOriginalPrice() {
		return 44.02f;
	}

	public float getCgTaxes() {
		return 35.5f;
	}

	public void run() {
		System.out.println("Central run");
	}

}
