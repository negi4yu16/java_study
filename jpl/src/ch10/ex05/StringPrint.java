package src.ex05;

public class StringPrint {

	/**
	 * ２つの引数のcharとそれらの間の文字列を表示する
	 * @param str 文字列
	 * @param c1 char1
	 * @param c2 char2
	 */
	public static void print(String str, char c1, char c2){
		int i1 = str.indexOf(c1);
		int i2 = str.indexOf(c2);
		int ti1 = i1;
		int ti2 = i2;

		System.out.println("");

		if(i1 > i2){
			int tmp = ti2;
			ti2 = ti1;
			ti1 = tmp;
		}

		StringBuilder b = new StringBuilder();
		for(int i = 1 ; i < ti2 - ti1 ; i++){
			b.append(str.charAt(ti1 + i));
		}

		System.out.println("[char1]="+ c1 + "/[char2]=" + c2 + "/[String]=" + b.toString());

	}

}
