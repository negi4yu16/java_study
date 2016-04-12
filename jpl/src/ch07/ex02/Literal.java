package ch07.ex02.src;

public class Literal {

	int int_num;
	double double_num;

	public void execute(){
		executeIntLiteral();
		executeDoubleLiteral();

	}
	private void executeIntLiteral(){

		System.out.println("intへ代入");
		int_num = 29;
		System.out.println(int_num);
//		int_num = (int)4294967295;	//範囲外でエラー
//		System.out.println(int_num);
		int_num = (int)29L;
		System.out.println(int_num);
		int_num = (int)3.5f;
		System.out.println(int_num);
		int_num = (int)18e+2;
		System.out.println(int_num);
		int_num = (int)180.0e-1;
		System.out.println(int_num);

	}

	private void executeDoubleLiteral(){

		System.out.println("doubleへ代入");
		double_num = 29;
		System.out.println(double_num);
//		int_num = (int)4294967295;	//範囲外でエラー
//		System.out.println(int_num);
		double_num = 29L;
		System.out.println(double_num);
		double_num = 3.5f;
		System.out.println(double_num);
		double_num = 18e+2;
		System.out.println(double_num);
		double_num = 180.0e-1;
		System.out.println(double_num);
		double_num = 0x12p0;
		System.out.println(double_num);
		double_num = 0x1.2p4;
		System.out.println(double_num);
		double_num = 0x.12p+8;
		System.out.println(double_num);

	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Literal lit = new Literal();
		lit.execute();
	}


}
