/** 
 * 戦略に従ってじゃんけんをするプレーヤーを表すクラス
 */

public class Player {
	private String name; // プレーヤー名
	private Strategy strategy; // プレーヤーが取る戦略
	private int wincount; // これまでの勝ち数
	private int losecount; // これまでの負け数
	private int gamecount; // これまでの総試合数

	/**
	 * プレーヤー名とそのプレーヤーが取る戦略を与えてプレーヤーオブジェクトを
	 * 生成するコンストラクタ。
	 * @param name プレーヤー名
	 * @param strategy プレーヤーが取る戦略
	 */
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	/**
	 * 次の数を求めるメソッド。
	 * @return 次の数を表す整数。
	 */
	public int nextNumber() {
		return strategy.nextNumber();
	}
	
	/**
	 * そのプレーヤーを勝ちとするメソッド。
	 * プレーヤーの持つ戦略で
	 */
	public void win() {
		strategy.lastGame(true);
		wincount++;
		gamecount++;
	}

	/**
	 * オブジェクトの文字列表現を返すメソッド。
	 * @return "[名前 : 試合数 games, 勝ち数 win, 負け数 lose]"の形式の文字列
	 */
	public void lose() {
		strategy.lastGame(false);
		losecount++;
		gamecount++;
	}

	public void even() {
		gamecount++;
	}

	/**
	 * オブジェクトの文字列表現を返すメソッド。
	 * @return "[名前 : 試合数 games, 勝ち数 win, 負け数 lose]"の形式の文字列
	 */
	@Override
	public String toString() {
		return "[" + name + ":" + gamecount + " games," +
			wincount + " win, " + losecount + " lose" + "]";
	}
}
