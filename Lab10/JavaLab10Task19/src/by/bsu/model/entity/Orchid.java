package by.bsu.model.entity;

public class Orchid extends Flower {
	private double height;
	private String color;
	private int flowerSize;
		
	public Orchid() {}
	
	public Orchid(double height, String color, int flowerSize, double price) {
		super(price);
		this.height = height;
		this.color = color;
		this.flowerSize = flowerSize;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public int getFlowerSize() {
		return flowerSize;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFlowerSize(int flowerSize) {
		this.flowerSize = flowerSize;
	}

	@Override
	public String toString() {
		return "Orchid (height: " + height + 
				"cm, color: " + color + 
				", flowerSize: " + flowerSize +
				", price: " + getPrice() + ")";
	}	
}
