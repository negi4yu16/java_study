package src;

public class LinkedList {
	private Object object;
	private LinkedList next;

	public LinkedList(Object obj){
		this.object = obj;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

	public static void main(String[] args){
		Vehicle v1 = new Vehicle(10,20,"Yamada");
		Vehicle v2 = new Vehicle(30,40,"Suzuki");
		Vehicle v3 = new Vehicle(50,60,"Satoh");

		LinkedList l1 = new LinkedList(v1);
		LinkedList l2 = new LinkedList(v2);
		LinkedList l3 = new LinkedList(v3);
		l1.setNext(l2);
		l2.setNext(l3);

	}

}
