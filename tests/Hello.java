public class Hello {
	private int member;

	public static void main(String[] args) {
	}
}

class Box<E> {
	private E elem;

	public E get() {
		return elem;
	}

	public void set(E elem) {
		this.elem = elem;
	}
	
	public <T> boolean isEmpty(Box<T> e2) {
		return elem == null;
	}
}