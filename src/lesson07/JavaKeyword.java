package lesson07;
import java.util.Random;


/**Javaの予約語問題集
 * @author nobu
 *
 */
class JavaKeyword implements Qestion{

	public String output() {
		return chooseSeparately();
	}

	// 問題集からランダムに一語選択するため
	private String chooseSeparately() {
		Random rand = new Random();
		int index = rand.nextInt(JavaKeywords.values().length);
		JavaKeywords word[] = JavaKeywords.values();
		return (word[index].getQuestion());
	}

	private static enum JavaKeywords {
		ABSTRACT("abstract"),
		ASSERT("assert"),
		BOOLEAN("boolean"),
		BREAK("break"),
		BYTE("byte"),
		CASE("case"),
		CATCH("catch"),
		CHAR("char"),
		CLASS("class"),
		CONST("const"),
		CONTINUE("continue"),
		DEFAULT("default"),
		DO("do"),
		DOUBLE("double"),
		ELSE("else"),
		ENUM("enum"),
		EXTENDS("extends"),
		FINAL("final"),
		FINALLY("finally"),
		FLOAT("float"),
		FOR("for"),
		IF("if"),
		GOTO("goto"),
		IMPLEMENTS("implements"),
		IMPORT("import"),
		INSTANCEOF("instanceof"),
		INT("int"),
		INTERFACE("interface"),
		LONG("long"),
		NATIVE("native"),
		NEW("new"),
		PACKAGE("package"),
		PRIVATE("private"),
		PROTECTED("protected"),
		PUBLIC("public"),
		RETURN("return"),
		SHORT("short"),
		STATIC("static"),
		STRICTFP("strictfp"),
		SUPER("super"),
		SWITCH("switch"),
		SYNCHRONIZED("synchronized"),
		THIS("this"),
		THROW("throw"),
		THROWS("throws"),
		TRANSIENT("transient"),
		TRY("try"),
		VOID("void"),
		VOLATILE("volatile"),
		WHILE("while");

		private String question;

		private String getQuestion() {
			return question;
		}

		private JavaKeywords(String question) {
			this.question = question;
		}
	}
}
