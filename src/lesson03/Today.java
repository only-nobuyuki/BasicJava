package lesson03;

public class Today {

	public static void main(String[] args) {
		A a = new A();
		a.setName("Java");
		a.say();

		A b = a;
		b.setName("hoge");
		b.say();
	}
}
