package src.ch03.ex03;

public class Y extends X {
	protected int yMask = 0xff00;

	/* 初期化子を使用してfullMaskの値を初期化			 	*/
	/* Yのフィールドの初期化がXのコンストラクタの後に実行されるため	*/
	{
		fullMask = 0x0000;
	}

	public Y(){
//		fullMask = 0x0000;
		fullMask |= yMask;
		System.out.printf("[Constructor Y]fullMask:%04x xMask:%04x yMask:%04x%n", fullMask, xMask, yMask);

	}

	public static void main(String[] args){
		X x = new X();
		int org = 0xffff;
		System.out.printf("masked result:%04x%n",x.mask(org));
		Y y = new Y();
		System.out.printf("masked result:%04x%n",y.mask(org));
	}
}
