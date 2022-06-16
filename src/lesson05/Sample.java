package lesson05;

public class Sample {

	public static void main(String[] args) {
		Singleton a= Singleton.getInstance();
		Singleton b= Singleton.getInstance();

		a.setValue("hello");
		System.out.println(b.getValue());
	}
}
