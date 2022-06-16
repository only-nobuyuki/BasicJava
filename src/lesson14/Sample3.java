package lesson14;

import java.util.function.Consumer;

public class Sample3 {
	public static void main(String[] args) {

		Consumer<Object> c = new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				System.out.println("r");
			}
		};
		Prin test=new Prin();
		test.execute(c);
	}
}