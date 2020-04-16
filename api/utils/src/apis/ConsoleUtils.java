package apis;

import java.util.Scanner;

@SuppressWarnings("resource")
public class ConsoleUtils {

	public static int readInt() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return Integer.parseInt(str);
	}
	
	public static double readDouble() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return Double.parseDouble(str);
	}
}
