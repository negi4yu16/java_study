package src.ch03.ex06;

/**
 * バッテリクラス
 */
public class Battery extends EnergySource {

	/**
	 * 空とするバッテリ残量
	 */
	private static final int EMPTY_REMAIN = 0;

	/**
	 * バッテリ残量(単位：%)
	 */
	protected int remain = 0;

	@Override
	public boolean empty() {
		if( this.remain <= EMPTY_REMAIN ){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * バッテリチャージする
	 */
	public void charge() {
		this.remain += 1;
	}

}
