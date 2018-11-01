package by.bsu.model.entity;

public class Iris extends Flower{
	private int height;
	private String color;
	
	public Iris() {}
	
	public Iris(int height, String color, double price) {
		super(price);
		this.height = height;
		this.color = color;
	}
	
	public int getHeight() {
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
		return "Iris (height: " + height + 
				"cm, color: " + color + 
				", price: " + getPrice() + ")";
	}	
}
