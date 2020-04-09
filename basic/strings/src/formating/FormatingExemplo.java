package formating;

public class FormatingExemplo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s1 = String.format("%d", 32); // 32
		String s2 = String.format("%o", 32); // 40
		String s3 = String.format("%x", 32); // 20
		
		String s4 = String.format("%#o", 32); // 040
		String s5 = String.format("%#x", 32); // 0x20
		String s6 = String.format("%#X", 32); // 0X20
		
		String s7 = String.format("W:%d X:%d", 5, 235); 	// W:5 X:235
		String s8 = String.format("W:%4d X:%4d", 5, 235); 	// W:   5 X: 235
		String s9 = String.format("W:%04d X:%04d", 5, 235); 	// W:0005 X:0235
		String s10 = String.format("W:%-4d X:%-4d", 5, 235); 	// W:5    X:235
		
		String s11 = String.format("%d", 1234567); 		// 1,234,567
		String s12 = String.format("%,.2f", 1234567); 	// 1,234,567.00
		
		String s13 = String.format("%+d", 123); 	// +123
		String s14 = String.format("%+d", -456); 	// -456
		
		String s15 = String.format("%3$d %1$d %4$d", 100, 200, 300); 	// 300 100 200
		
	}

}
