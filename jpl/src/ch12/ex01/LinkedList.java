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

	public LinkedList<E> find(LinkedList<E> list) throws ObjectNotFoundException{

		try{
			if(e.equals(list.getObject())){
				return this;
			}
			if(this.next != null){
				LinkedList<E> result = this.next.find(list);
				if(result != null){
					return result;
				} else {
					throw new ObjectNotFoundException(e.toString());
				}
			}
		}catch(ObjectNotFoundException e){
			throw new ObjectNotFoundException(e.toString());
		}finally{
		}
		return null;
	}

	public static void main(String[] args) {
		LinkedList<String> listA = new LinkedList<String>("A");
		LinkedList<String> listB = new LinkedList<String>("B");
		LinkedList<String> listC = new LinkedList<String>("C");
		LinkedList<String> listD = new LinkedList<String>("D");

		listA.setNext(listB);
		listB.setNext(listC);

		LinkedList<String> list;

		try{
			list = listA.find(listB);
			System.out.println("OK1");
			list = listA.find(listD);
			System.out.println("OK2");
		}catch(ObjectNotFoundException e){
			e.printStackTrace();
		}


	}

}
