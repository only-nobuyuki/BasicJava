package lesson07;

public class CorrectJavaKeywordsAnswer {
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
