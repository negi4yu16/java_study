package src.ch05.ex01;

public interface Attributed {

	void add(Attributed.Attr newAttr);
	Attributed.Attr find(String attrName);
	Attributed.Attr remove(String attrName);
	java.util.Iterator<Attributed.Attr> attrs();

	/*Attrクラスはstaticでプログラム上はひとつのオブジェクトしか持たないのでネストした型であるべきでない。*/
	public static class Attr {
		public String name;
		public Object value;

		public Attr(String name){
			this.name = name;
		}
		public Attr(String name, Object value){
			this.name = name;
			this.value = value;
		}
		public String getName(){
			return name;
		}
		public Object getValue(){
			return value;
		}
		public Object setValue(Object newValue){
			Object oldVal = value;
			value = newValue;
			return oldVal;
		}
		public String toString(){
			return name + "='" + value + "'";
		}

	}
}
