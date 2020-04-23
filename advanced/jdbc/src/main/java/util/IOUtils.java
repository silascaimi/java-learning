package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOUtils {

	public static String readFile(String pathname) throws FileNotFoundException {
		String str = "";
		try (Scanner scanner = new Scanner(new File(pathname))) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				str += line + "\n";
			}
		}
		return str;
	}

	public static void transfer(InputStream in, OutputStream out) throws IOException {

		byte[] buffer = new byte[1024];

		int bytesLidos;
		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
