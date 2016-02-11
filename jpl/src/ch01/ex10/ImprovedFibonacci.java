package src;

public class ImprovedFibonacci {
	static final String title = "Fibonacci Sequence";
	static final int MAX_INDEX = 10;
	private int[] valueList = new int[MAX_INDEX];
	private boolean[] isEvenList = new boolean[MAX_INDEX];

	public void createSequence(){
		int lo = 1;
		int hi = 1;

		for(int i = 0 ; i < MAX_INDEX ; i++ ){
			if(i == 0){
				valueList[i] = lo;
			} else {
				valueList[i] = hi;
				hi = lo + hi;
				lo = hi - lo;
			}
		}

		for(int i = 0 ; i < MAX_INDEX ; i++){
			if(valueList[i] % 2 == 0 ){
				isEvenList[i] = true;
			}else {
				isEvenList[i] = false;
			}
		}
	}

	public void viewSequence(){
		System.out.println(title);
		String mark;
		for(int i = 0; i < MAX_INDEX ; i++ ){
			if(isEvenList[i] == true ){
				mark = " *";
			}else {
				mark = "";
			}
			System.out.println( (i+1) + ":" + valueList[i] + mark);
		}
	}

	public static void main(String[] args) {
		ImprovedFibonacci f = new ImprovedFibonacci();
		f.createSequence();
		f.viewSequence();
	}

}
