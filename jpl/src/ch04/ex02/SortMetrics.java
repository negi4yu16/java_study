package src.ch04.ex02;

final class SortMetrics implements Cloneable {

	//public long probeCnt, compareCnt, swapCnt;
	private long probeCnt, compareCnt, swapCnt;

	/*コンストラクタを定義してinit()が必ず呼ばれるように変更*/
	public SortMetrics(){
		init();
	}
	public void init(){
		probeCnt = swapCnt = compareCnt = 0;
	}
	public String toString(){
		return probeCnt + " probe " + compareCnt + " compares " + swapCnt + " swap";
	}

	public SortMetrics clone(){
		try{
			return (SortMetrics)super.clone();
		}catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}
	/*追加*/
	public void countProbeCnt(){
		probeCnt++;
	}
	/*追加*/
	public void countCompareCnt(){
		compareCnt++;
	}
	/*追加*/
	public void countSwapCnt(){
		swapCnt++;
	}
}
