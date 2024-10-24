package mart;

public abstract class Product {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "[" +name+ "," + price + "]";

	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}