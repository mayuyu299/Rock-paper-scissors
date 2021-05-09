import java.util.Random;


public class RandomStrategy implements Strategy {
	private Random rnd = new Random();
	private boolean won = false; // 前回の勝敗を表す。初期値は負け。

	public int nextNumber() {
		return rnd.nextInt(9);
	}
	public void lastGame(boolean win) {
		won = win;
	}
}
