import java.util.Random;


public class RandomStrategy implements Strategy {
	private Random rnd = new Random();
	private boolean won = false; // �O��̏��s��\���B�����l�͕����B

	public int nextNumber() {
		return rnd.nextInt(9);
	}
	public void lastGame(boolean win) {
		won = win;
	}
}
