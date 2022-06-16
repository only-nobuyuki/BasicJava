package lesson07;
import java.io.IOException;

class TypingGameLogic implements TypingGameLogicImp{
	// 問題と正解が一致する形式に使用する
	public void start(Qestion q) throws IOException {
		String question = q.output();
		String answer;
		Answer a = new Answer();
		System.out.println("タイピングゲームです");
		System.out.println(question);
		while ((answer = a.input()) != null) {
			if (question.equals(answer)) {
				System.out.println("次の問題");
				question = new JavaKeyword().output();
			} else {
				System.out.println("不正解");
				System.out.println("もう一度");
			}
			System.out.println(question);
		}
	}

	/*// 問題と正解が一致しない形式に使用する
	void comparison(Qestion qestion, CorrectAnswer correctAnswer) {
		String question = q.output();
		String answer;
		Answer a = new Answer();
		System.out.println("問題");
		System.out.println(question);
		while ((answer = a.input()) != null) {
			if (question.equals(answer)) {
				System.out.println("次の問題");
				question = new JavaKeyword().output();
			} else {
				System.out.println("不正解");
				System.out.println("もう一度");
			}
			System.out.println(question);
		}
	}*/
}
