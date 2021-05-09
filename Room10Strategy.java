import java.util.Random;

public class Room10Strategy implements Strategy {
	private Random rnd = new Random();
	private boolean won = false;
	private int prevNumber;

	public int nextNumber() {
		if (!won) {
			prevNumber = 2;
		} else {
			prevNumber = rnd.nextInt(2);
		}
		return prevNumber;
	}

	public void lastGame(boolean win) {
		won = win;
	}
}
