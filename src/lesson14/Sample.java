package lesson14;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample {

	public static void main(String[] args) throws IOException {
		Item item = new Item("apple", 199);

		FileOutputStream fos = new FileOutputStream("item.ser");

		try (ObjectOutputStream out = new ObjectOutputStream(fos);) {
			out.writeObject(item);
		}
		System.out.println("finish");
	}
}