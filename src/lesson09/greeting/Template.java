package lesson09.greeting;

public abstract class Template {

	private Template next;

	Template setNext(Template next) {
		this.next = next;
		return next;
	}

	public void exe() {
		this.petform();
		if (this.next != null) {
			this.next.exe();
		}
	}

	protected abstract void petform();
}
