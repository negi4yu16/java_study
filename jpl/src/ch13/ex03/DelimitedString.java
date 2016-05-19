package src.ex03;

import java.util.ArrayList;
import java.util.List;

public class DelimitedString {

	public static String[] delimitedString(String from, char start, char end){
		List<String> list = new ArrayList<String>();
		int startPos = 0;
		int endPos = 0;
		int tmpPos = -1;

		while(true){
			startPos = from.indexOf(start, startPos);
			endPos = from.indexOf(end, endPos);
			if(startPos == -1){
				break;
			} else if(endPos == -1){
//				list.add(from.substring(startPos));
			} else if(startPos > endPos){
				endPos = startPos + 1;
				if(tmpPos == endPos){
					break;
				}
				tmpPos = endPos;
			} else {
				list.add(from.substring(startPos,  endPos + 1));
				startPos = endPos + 1;
				endPos = endPos + 1;
			}

		}
		String[] array = list.toArray(new String[0]);

		return array;

	}

	public static void main(String[] args){

//		String from = "a<test>b<result>";
		String from = ">abc<t><";
//		String from = "test>b<result>abc>t<";
		char start = '<';
		char end = '>';

		String[] array = DelimitedString.delimitedString(from, start, end);

		for(String str : array){
			System.out.println(str);
		}
	}

}
