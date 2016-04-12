package ex03.src;

public class Pascal {

	int[][] n;

	public void calc(int num){
		n = new int[num][];

		for(int i = 0; i < n.length ; i++ ){
			n[i] = new int[i+1];
		}


		for (int i = 0 ; i < num ; i++){
			for (int j = 0 ; j < n[i].length ; j++){
				n[i][j] = comb(i,j);
			}
		}
	}

	private int comb(int n, int r)
	{
		if ( r == 0 || r == n ){
			return 1;
		}
		return comb(n - 1, r - 1) + comb(n - 1, r);
	}

	public void print(){

		for (int i = 0 ; i < n.length ; i++){
			System.out.printf("%3d: ", i+1);
			for (int j = 0 ; j < n[i].length ; j++){
				System.out.printf("%3d ", n[i][j]);
			}
			System.out.printf("%n");

		}
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pascal p = new Pascal();
		p.calc(12);
		p.print();

	}

}
