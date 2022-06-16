package lesson12;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Item setName(String name) {
		return new Item(name, this.price);
	}

	public int getPrice() {
		return price;
	}

	public Item setPrice(int price) {
		return new Item(this.name, price);
	}

}
