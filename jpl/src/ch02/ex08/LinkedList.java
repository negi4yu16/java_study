package src;

public class LinkedList {
	private Object object;
	private LinkedList next;

	public LinkedList(){
	}

	public LinkedList(Object obj){
		this.object = obj;
	}

	public LinkedList(Object obj, LinkedList next){
		this.object = obj;
		this.next = next;
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

}
