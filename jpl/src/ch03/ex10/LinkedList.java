package src.ch03.ex10;

public class LinkedList implements Cloneable {
	private Object object;
	private LinkedList next;

	public LinkedList(){
		this.object = null;
		this.next = null;
	}

	public LinkedList(Object obj){
		this.object = obj;
		this.next = null;
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

	public LinkedList clone() throws CloneNotSupportedException{
		try{
			LinkedList list = (LinkedList)super.clone();//新たなリストで複製
			//list.object = super.clone();//オブジェクトの参照は複製元のまま
			//list.next = next.clone();//オブジェクトの参照は複製元のまま
			return list;
		}catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}

}
