package src;

public class Fibonacci {
	static final int MAX_INDEX = 10;
	private int[] list = new int[MAX_INDEX];
	static final String title = "Fibonacci Sequence";

	public void createSequence(){
		int lo = 1;
		int hi = 1;

		for(int i = 0 ; i < MAX_INDEX ; i++ ){
			if(i == 0){
				list[i] = lo;
			} else {
				list[i] = hi;
				hi = lo + hi;
				lo = hi - lo;
			}
		}
	}

	public void viewSequence(){
		System.out.println(title);
		for(int i = 0; i < MAX_INDEX ; i++ ){
			System.out.println( (i+1) + ":" + list[i]);
		}
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.createSequence();
		f.viewSequence();
	}
}
