package src.ex01;

public class Replacement {

	//改行
	private static final char NEWLINE = '\n';
	//タブ
	private static final char TAB = '\t';
	//バックスペース
	private static final char BACK_SPACE = '\b';
	//復帰
	private static final char RETURN = '\r';
	//フォームフィード
	private static final char FORM = '\f';
	//バックスラッシュ
	private static final char BACK_SLASH = '\\';
	//シングルクォート
	private static final char SINGLE_QUOTE = '\'';
	//ダブルクォート
	private static final char DOUBLE_QUOTE = '\"';


	public static String replace(String str){

		StringBuilder builder = new StringBuilder();

		char c;
		for(int i = 0 ; i < str.length() ; i++ ){
			c = str.charAt(i);

			if( c == NEWLINE ||
				c == TAB ||
				c == BACK_SPACE ||
				c == RETURN ||
				c == FORM ||
				c == BACK_SLASH ||
				c == SINGLE_QUOTE ||
				c == DOUBLE_QUOTE
			){
				builder.append('\\');
				builder.append(c);
			} else {
				builder.append(c);
			}
		}

		return builder.toString();
	}

}
