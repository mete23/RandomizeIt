import java.util.concurrent.ThreadLocalRandom;
public class random {
	
	static public int randomInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max +1);
	}
}
