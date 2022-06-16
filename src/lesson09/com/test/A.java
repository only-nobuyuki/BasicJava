package lesson09.com.test;

public class A extends AbstractChain{

	public A() {
		super(Type.A);

	}

	@Override
	protected void perform() {
		System.out.println("A");

	}

}
