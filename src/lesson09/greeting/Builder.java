package lesson09.greeting;


public class Builder {
	public Template build() {
		Template a = new Hello();
		a.setNext(new Nut().setNext(new Out()));
		return a;
	}
}
