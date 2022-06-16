package lesson01;

public class Hello {
	public static void main(String[] args) {
		String[] item = new String[4];
		item[0] = args[0];
		int a = 10;
		//評価順を気をつけよう
		int b = a++;
		System.out.println(a);
		System.out.println(b);
	}
}
