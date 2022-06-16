package lesson08.main;

import ab.A;

public class Main {

	public static void main(String[] args) {
		//protectedだから見えないね
		B.hoge();
		A a =new A();
		a.call();
	}
}
