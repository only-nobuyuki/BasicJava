package lesson12;
import java.time.LocalDate;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		String st;
		LocalDate date=LocalDate.now();
		LocalDate birth= LocalDate.of(1982, 10, 20);

		System.out.println(date.plusDays(2));
		System.out.println(birth);

		Period res=birth.until(date);
		System.out.println(res);
	}

}
