/** 
 * Strategy�f�U�C���p�^�[���Ɋ�Â������̂��߂̃C���^�t�F�[�XStrategy
 */

public interface Strategy {
	/**
	 * ���̐������߂郁�\�b�h�B
	 * @return ���̐��B
	 */
	int nextNumber();

	/**
	 * �O�̉�̏��s���o���郁�\�b�h�B
	 * @param win �O��̏��s�������B�O�񏟂��Ă����true�A�����Ă����false
	 */
	void lastGame(boolean win);
}
