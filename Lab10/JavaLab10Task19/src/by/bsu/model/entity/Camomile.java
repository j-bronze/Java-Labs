package by.bsu.model.entity;

public class Camomile extends Flower{
	private double height;
	private String color;
	private boolean garden;
		
	public Camomile() {}
	
	public Camomile (double height, String color, boolean garden, double price) {
		super(price);
		this.height = height;
		this.color = color;
		this.garden = garden;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	@Override
	public String toString() {
		return "Camomile (height: " + height + 
				"cm, color: " + color + 
				", garden: " + garden +
				", price: " + getPrice() + ")";
	}
	
	
}
