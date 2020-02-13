package br.com.java.basic.strings;

public class StringBuilderExemplo {

	@SuppressWarnings("preview")
	public static void main(String[] args) {

		// StringBuilder e StringBuffer
		// StringBuffer é recomendado para acesso concorrente
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("def");

		sb.delete(4, 5); // remove os caracteres inicio(incluindo) até fim(excluindo)
		System.out.println(sb.toString());

		sb.insert(3, "Fim"); // insere uma String a partir do caractere informado
		System.out.println(sb.toString());

		sb.reverse(); // Inverte um StringBuilder
		System.out.println(sb.toString());

		String s5 = sb.toString();
		System.out.println(s5);

		// aplicacao de text block
		String string = """
				   Ola
				   Sejam bem vindos
				       Com tabulacoes
				""";

		System.out.println(string);
	}

}
