package lesson09.main;
import lesson09.com.test.AbstractChain;
import lesson09.com.test.Builder;
import lesson09.com.test.Type;

public class Main {
	public static void main(String[] args) {
		Builder b=new Builder();
		AbstractChain a= b.build();
		a.exe(Type.C);
	}
}
