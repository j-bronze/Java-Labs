package by.bsu.model.entity.container;

import by.bsu.model.entity.Flower;

public class Bouquet {
	
	public static final int DEFAULT_SIZE = 50;
	
	private Flower[] bouquet;
	private int size = 0;
	
	public Flower[] getFlower() {
		return bouquet;
	}

	public int getSize() {
		return size;
	}
		
	public Bouquet() {
		bouquet = new Flower[DEFAULT_SIZE];
	}
	
	public void add(Flower flower) {
		if(size < bouquet.length) {
			bouquet[size++] = flower;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Flowers in bouquet:\n");
		
		for(int i = 0; i<size;i++) {
			builder.append(bouquet[i]).append("\n");
		}
		
		return builder.toString();
	}	
}
