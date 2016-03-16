package src.ch03.ex12;

public abstract class SortHarness {

	private Object[] values;
	private final SortMetrics curMetrics = new SortMetrics();

	public final SortMetrics sort(Object[] data){
		values = data;
		curMetrics.init();
		doSort();
		return getMetrics();
	}
	public final SortMetrics getMetrics(){
		return curMetrics.clone();
	}
	protected final int getDataLength(){
		return values.length;
	}
	protected final Object probe(int i){
//		curMetrics.probeCnt++;
		curMetrics.countProbeCnt();
		return values[i];
	}
	protected final int compare(int i, int j){
//		curMetrics.compareCnt++;
		curMetrics.countCompareCnt();
		int i1 = values[i].hashCode();
		int i2 = values[j].hashCode();
		if(i1 == i2){
			return 0;
		} else {
			return ( i1 < i2 ? -1 : 1 );
		}
	}
	protected final void swap(int i, int j){
//		curMetrics.swapCnt++;
		curMetrics.countSwapCnt();
		Object tmp = values[i];
		values[i] = values[j];
		values[j] = tmp;
	}
	protected abstract void doSort();

}
