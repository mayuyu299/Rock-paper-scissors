/** 
 * Strategyデザインパターンに基づく実装のためのインタフェースStrategy
 */

public interface Strategy {
	/**
	 * 次の数を求めるメソッド。
	 * @return 次の数。
	 */
	int nextNumber();

	/**
	 * 前の回の勝敗を覚えるメソッド。
	 * @param win 前回の勝敗を示す。前回勝っていればtrue、負けていればfalse
	 */
	void lastGame(boolean win);
}
