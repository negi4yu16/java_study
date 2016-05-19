package src.ex01;

public class LinkedList<E> implements Cloneable {
	private E e;
	private LinkedList<E> next;

	public LinkedList(){
		this.e = null;
		this.next = null;
	}

	public LinkedList(E obj){
		this.e = obj;
		this.next = null;
	}

	public LinkedList(E obj, LinkedList<E> next){
		this.e = obj;
		this.next = next;
	}

	public E getObject() {
		return e;
	}

	public void setObject(E e) {
		this.e = e;
	}

	public LinkedList<E> getNext() {
		return next;
	}

	public void setNext(LinkedList<E> next) {
		this.next = next;
	}

	public String toString(){
		return "LinkedList Object";
	}

	public int size(){
		if(this.next == null){
			return 1;
		} else {
			return next.size()+ 1;
		}
	}

	public Object clone() throws CloneNotSupportedException{
		try{
			LinkedList<?> list = (LinkedList<?>)super.clone();//新たなリストで複製
			return list;
		}catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}

}
