package lesson02;
public class Pro {
	public static void main(String[] args) {
		System.out.println("mainがうごきました");
		int i = 10;
		System.out.println(aMethod(i));
		System.out.println("mainがaMethodが呼びました");
	}

	public static int aMethod(int a) {
		System.out.println("aMethodがうごきました");
		int aa = a + 1;
		int n = bMethod(aa);
		System.out.println("aMethodがbMethodが呼びました");
		return n;
	}

	public static int bMethod(int b) {
		System.out.println("bMethodがうごきました");
		int bb = b * 7;
		return bb;
	}
}
