package src.ex02;

public class CountStr {

	public static int count(String str, String cmp){
		int length = str.length();
		int pos = 0;
		int count = 0;
		while(pos < length){
			pos = str.indexOf(cmp, pos);
			if(pos >= 0){
				count++;
				pos+=cmp.length();
			} else {
				return count;
			}
		}
		return count;
	}


	public static void main(String[] args){

//		String str = "AAAAAABABCS";
		String str = "asdfgAAbAAb";
		String cmp = "AA";

		int result = CountStr.count(str, cmp);

		System.out.println(result);

	}

}
