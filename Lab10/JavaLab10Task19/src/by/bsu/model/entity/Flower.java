package by.bsu.model.entity;

public class Flower {
	private double price;
	
	public Flower (){}
	
	public Flower (double price){
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
