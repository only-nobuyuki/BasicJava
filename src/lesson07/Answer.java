package lesson07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**回答方法
 * @author nobu
 *
 */
class Answer {

	/**回答をコンソール入力で行う
	 * @return
	 * @throws IOException
	 */
	String input() throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			return in.readLine();
		} catch (IOException e) {
			throw e;
		}
	}
}
