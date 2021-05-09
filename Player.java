/** 
 * �헪�ɏ]���Ă���񂯂������v���[���[��\���N���X
 */

public class Player {
	private String name; // �v���[���[��
	private Strategy strategy; // �v���[���[�����헪
	private int wincount; // ����܂ł̏�����
	private int losecount; // ����܂ł̕�����
	private int gamecount; // ����܂ł̑�������

	/**
	 * �v���[���[���Ƃ��̃v���[���[�����헪��^���ăv���[���[�I�u�W�F�N�g��
	 * ��������R���X�g���N�^�B
	 * @param name �v���[���[��
	 * @param strategy �v���[���[�����헪
	 */
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	/**
	 * ���̐������߂郁�\�b�h�B
	 * @return ���̐���\�������B
	 */
	public int nextNumber() {
		return strategy.nextNumber();
	}
	
	/**
	 * ���̃v���[���[�������Ƃ��郁�\�b�h�B
	 * �v���[���[�̎��헪��
	 */
	public void win() {
		strategy.lastGame(true);
		wincount++;
		gamecount++;
	}

	/**
	 * �I�u�W�F�N�g�̕�����\����Ԃ����\�b�h�B
	 * @return "[���O : ������ games, ������ win, ������ lose]"�̌`���̕�����
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
	 * �I�u�W�F�N�g�̕�����\����Ԃ����\�b�h�B
	 * @return "[���O : ������ games, ������ win, ������ lose]"�̌`���̕�����
	 */
	@Override
	public String toString() {
		return "[" + name + ":" + gamecount + " games," +
			wincount + " win, " + losecount + " lose" + "]";
	}
}
