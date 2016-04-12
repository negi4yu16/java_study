package src.ex02;

public class BitCount {

	private final int IntSize = 32;

	static public int countInt(int n){
		int MASK = 0x0001;
		int count = 0;
		for(int i = 0 ; i < 32 ; i++){
			if((n & MASK) == MASK ){
				count++;
			}
			n = n >>> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int result = 0;
		result = BitCount.countInt(65535);
		System.out.println(result);

		result = Integer.bitCount(65535);
		System.out.println(result);
/*
 * 参考-Integer.bitCountの処理
		public static int bitCount(int i) {
	        // HD, Figure 5-2
	        i = i - ((i >>> 1) & 0x55555555);
	        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
	        i = (i + (i >>> 4)) & 0x0f0f0f0f;
	        i = i + (i >>> 8);
	        i = i + (i >>> 16);
	        return i & 0x3f;
	    }
*/

	}

}
