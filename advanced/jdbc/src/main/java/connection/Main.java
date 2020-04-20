package connection;

public class Main {

	public static void main(String[] args) {

		try {
			ConnectComponent comp = new ConnectComponent();
			
			if (comp.tryConnection()) {
				System.out.println("Tentativa de conexão foi um SUCESSO");
			} else {
				System.out.println("Tentantiva de conexão FALHOU");
			}
		} catch (Exception e) {
			util.ExceptionHandler.handleException(e);
		}
	}
}
