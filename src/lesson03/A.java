package lesson03;

public class A {
	private String name = null;;

	public void say() {
		String name = null;
		System.out.println("hell " + getName());
		System.out.println("hell " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
