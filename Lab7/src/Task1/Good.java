package Task1;

public class Good {
	private String name;
	private double price;
	private int weight;
	private boolean availability;
	private int quantity;

	public Good() {
		availability = false;
		quantity = 0;
	}
	
	public Good(String name, double price, int weight, boolean availability,  int quantity) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.availability = availability;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return name + " (" + " m.u.)";
	}

	
}
