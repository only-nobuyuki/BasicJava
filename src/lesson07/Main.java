package lesson07;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// 問題を選択
		Qestion qusetion = new JavaKeyword();
		// 正解を選択
		TypingGameLogicImp logic = new TypingGameLogic();
		logic.start(qusetion);
	}
}
