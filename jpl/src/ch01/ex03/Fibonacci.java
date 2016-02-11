package src;

public class Fibonacci {

	public static void main(String[] args) {

		int lo = 1, hi = 1;
		int i = 1;
		System.out.println("Fibonacci Sequence");
		System.out.println("F(" +(i++) +")=" + lo);
		while (hi < 50){
			System.out.println("F(" +(i++) +")=" + hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}

}
