package src.ex01;

public class CountChar {

	public static int count(String str, char ch){
		int length = str.length();
		int pos = 0;
		int count = 0;
		while(pos < length){
			pos = str.indexOf(ch, pos);
			if(pos >= 0){
				count++;
				pos++;
			} else {
				return count;
			}
		}
		return count;
	}


	public static void main(String[] args){

		String str = "AAAAAABABCS";
		char ch = 'A';

		int result = CountChar.count(str, ch);

		System.out.println(result);

	}
}
