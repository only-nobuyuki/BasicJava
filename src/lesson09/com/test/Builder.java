package lesson09.com.test;

public class Builder {
	public AbstractChain build() {
		AbstractChain a = new A();
		AbstractChain b = new B();
		AbstractChain c = new C();

		a.setChain(b).setChain(c);
		return a;
	}
}
