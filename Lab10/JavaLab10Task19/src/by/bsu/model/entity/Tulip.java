package by.bsu.model.entity;

public class Tulip extends Flower {
	private int height;
	private String color;
	
	public Tulip() {}
	
	public Tulip(int height, String color, double price) {
		super(price);
		this.height = height;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tulip (height: " + height + 
				"cm , color: " + color + 
				", price: " + getPrice() + ")";
	}	
}
