package src.ch04.ex01;

/**
 * ガソリンタンククラス
 */
public class GasTank implements EnergySource {

	/**
	 * 空とするガソリン量
	 */
	private static final int EMPTY_AMOUNT = 0;

	/**
	 * ガソリン量（単位：リットル）
	 */
	private int amount = 0;

	/**
	 * 空チェック
	 * @return 空(true)/空でない(false)
	 */
	public boolean empty(){
		if(this.amount <= EMPTY_AMOUNT ){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ガソリンを補給する
	 * @param ガソリン量(単位：リットル)
	 * @return 空(true)/空でない(false)
	 */
	public void supply(int amount){
		this.amount += amount;
	}
}
