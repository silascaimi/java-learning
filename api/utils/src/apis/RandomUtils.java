package apis;

public class RandomUtils {

	public static int nextInt(int min, int max) {
		int delta = max - min;
		return (int) (Math.random() * delta + min + 1);
	}
}
