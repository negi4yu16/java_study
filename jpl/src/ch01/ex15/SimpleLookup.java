package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleLookup implements Lookup {

//	private final int MAX_SIZE = 10;
	private String[] names;
	private Object[] values;

	public SimpleLookup(){
		names = new String[0];
		values = new Object[0];
	}

	@Override
	public Object find(String name) {

		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name)){
				return values[i];
			}
		}
		return null;
	}

	@Override
	public void add(String name, Object value) {
		List<String> namesList;
		List<Object> valueList;
		if(this.names.length != 0){
			namesList = new ArrayList<String>(Arrays.asList(this.names));
			valueList = new ArrayList<Object>(Arrays.asList(this.values));
		} else {
			namesList = new ArrayList<String>();
			valueList = new ArrayList<Object>();
		}
		namesList.add(name);
		valueList.add(value);
		this.names = (String[])namesList.toArray(new String[namesList.size()]);
		this.values = (String[])valueList.toArray(new String[valueList.size()]);
	}

	@Override
	public void remove(String name ) {
		 List<String> namesList=new ArrayList<String>(Arrays.asList(this.names));
		 List<Object> valueList=new ArrayList<Object>(Arrays.asList(this.values));

		 int index = namesList.indexOf(name);
		 namesList.remove(index);
		 valueList.remove(index);

		 this.names = (String[])namesList.toArray(new String[namesList.size()]);
		 this.values = (String[])valueList.toArray(new String[valueList.size()]);
	}



}
