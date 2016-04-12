package src.ex02;

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
			switch(c){
			case NEWLINE:
			case TAB:
			case BACK_SPACE:
			case RETURN:
			case FORM:
			case BACK_SLASH:
			case SINGLE_QUOTE:
			case DOUBLE_QUOTE:
				builder.append('\\');
			default :
				builder.append(c);
			}
		}

		return builder.toString();
	}

}
