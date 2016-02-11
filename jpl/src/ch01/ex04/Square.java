package src;

public class Square {

	public static void main(String[] args) {

		int i = 1;
		int value = 0;
		System.out.println("Square Sequence");
		while( i < 10){
			value = i*i;
			System.out.println("F(" + i + ")=" + value );
			i++;
		}
	}

}
