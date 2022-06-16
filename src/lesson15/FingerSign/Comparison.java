package lesson15.FingerSign;

class Comparison {
	FingerSign player;
	FingerSign opponent;

	public void comparison(int m, int y) {
		String win = "勝ちました。";
		String lose = "負けました";
		if (m - y == 0) {
			System.out.println("あいこです");
		}
		
		if (m == 0) {
			if (y == 1) {
				System.out.println(lose);
			} else if (y == 2) {
				System.out.println(win);
			}
		}

		if (m == 1) {
			if (y == 0) {
				System.out.println(lose);
			} else if (y == 2) {
				System.out.println(win);
			}
		}

		if (m == 2) {
			if (y == 0) {
				System.out.println(win);
			} else if (y == 1) {
				System.out.println(lose);
			}
		}
	}
}
