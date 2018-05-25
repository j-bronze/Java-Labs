package Task1;

public class Store {
	private String nameStorage;
	private Good good1;
	private Good good2;
	private Good good3;
	
	public Store() {}

	public Store(String name) {this.nameStorage = name;}
	
	public Store(String name, Good gd1, Good gd2, Good gd3) {
		this.nameStorage = name;
		this.good1 = gd1;
		this.good2 = gd2;
		this.good3 = gd3;
	}

	public String getNameStorage() {
		return nameStorage;
	}

	public void setNameStorage(String name) {
		this.nameStorage = name;
	}

	public Good getGood1() {
		return good1;
	}

	public void setGood1(Good gd1) {
		this.good1 = gd1;
	}

	public Good getGood2() {
		return good2;
	}

	public void setGood2(Good gd2) {
		this.good2 = gd2;
	}

	public Good getGood3() {
		return good3;
	}

	public void setGood3(Good gd3) {
		this.good3 = gd3;
	}
	
	
	
}
