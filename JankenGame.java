public class JankenGame {
	public static void main(String[] args) {
		Player p1 = new Player("Taro", new Room10Strategy());
		Player p2 = new Player("Hanako", new RandomStrategy());

		for(int i=0; i<100; i++) {
			int p1_nextNumber = p1.nextNumber();
			int p2_nextNumber = p2.nextNumber();
			if ((p1_nextNumber == 0 && p2_nextNumber == 2) || (p1_nextNumber > p2_nextNumber)) {
				System.out.println("Winner:" + p1);
				p1.win();
				p2.lose();
			} else if ((p1_nextNumber == 2 && p2_nextNumber == 0) || (p2_nextNumber > p1_nextNumber)) {
				System.out.println("Winner:" + p2);
				p1.lose();
				p2.win();
			} else {
				System.out.println("Even.");
				p1.even();
				p2.even();
			}
		}

	}
}
