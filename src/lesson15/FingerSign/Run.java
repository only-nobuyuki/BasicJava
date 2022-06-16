package lesson15.FingerSign;

import java.util.Scanner;

public class Run {
	public void run() {
		System.out.println("じゃんけん開始！");
		System.out.println("チョキ、グー、パーのどれかを入力してくだい");
		Scanner scanner = new Scanner(System.in);
		String input = null;

		for (int i = 0; i >= 0; i++) {
			input = scanner.nextLine();
			if (input.equals("チョキ") || input.equals("グー") || input.equals("パー")) {
				break;
			} else {
				System.out.println("不正な値が入力されました。");
				System.out.println("もう一度入力してください。");
			}
		}
		FingerSign player = new FingerSign();
		FingerSign ai = new FingerSign();
		int p = player.janken(input);
		int a = ai.jakenAI();
		Comparison c = new Comparison();
		c.comparison(p, a);
		scanner.close();

	}
}
