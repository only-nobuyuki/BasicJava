package lesson14;
import java.util.function.Consumer;

public class Prin {
	public void execute(Consumer<Object> c) {
		c.accept("Hell");
	}
}
