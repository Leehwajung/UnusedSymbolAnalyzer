public class Hello2 {
	private int member;

	public static void main(String[] args) {
		int local;
		
		Box<String> asdf = new Box<String>();
		System.out.println("Hello world!");

		for (int i = 0; i < 10; i++) {

		}
		Integer d = new Integer(1);

		// 
		OuterClass oc = new OuterClass() {
			@Override
			public int meth() {
				return 2;
			}
		};
	}
	
	public int method(String str, int ddd, long ll) {
		Box<String> bb = new Box<String>();
		bb.get();
		new InnerClass() {
			@Override
			public int meth() {
				return 1;
			}
		};
		
		return 2;
	}
	
	public <E> E m2(String str, int ddd) {
		E aa = null;// = new E();
		return aa;
	}
	
	public <E> E elem(String str, int ddd) {
		E aa = null;// = new E();
		return aa;
	}

	public class InnerClass {
		public InnerClass() {

		}

		public int meth() {
			return 1;
		}
	}

	public enum Em {
		a, b, c
	};

}

class Box2<E> {
	private E elem;

	public E get() {
		return elem;
	}

	public void set(E elem) {
		this.elem = elem;
	}
	
	public <T, S> boolean isEmpty(Box<T> e2, S ss) {
		return elem == null;
	}
}


class OuterClass {
	public OuterClass() {

	}

	public int meth() {
		return 1;
	}
}