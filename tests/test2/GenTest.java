import java.util.*;

import polyglot.ast.Call;

public class GenTest {
	public static int st;
	private int member;
	private double m55 = 5.5;
	private ASDF as;
	private int aaaaaaa = 1;
//	private GenTest2 g2;
	
	private int aa = 6;
	private int vv = aa;
	
	public void main(String[] args) {
		
		int x = 7;
		mmmmm = method(1.1);
		char dd;
		dd = mmmmm;
		int d = x;
		int y = GenTest.st;
		method(m55);
		int qwer = aaaaaaa;
	}
	
	private char method(double dd) {
		int aa = 6;
		int ff = aa;
		mmmmm = 'b';
		member = (int)dd;
		String asdf;
		System.out.println("Call=" + mmmmm);
		qwer(2.2);
		as = new ASDF(1);
		int d, x = 3;
		d=x;
		as.zxcv(3.3);
		for(ff = 0; ff <10; ff++) {
			
		}
		
//		char asdfffffff = char2;
		
		return 'a';
	}
	
	public void qwer(double dd) {
//		GenTest2 g2;
	}
	
	private char mmmmm;
	private char char2;
	
	public char me(GenTest2 ggg2) {
		GenTest4 asd= (GenTest4)ggg2;
		
		if(asd instanceof GenTest2) {
			char asdfffffff = char2;
			char qqqqqq;
			qqqqqq= asdfffffff;
		}
		
		return 'a';
	}
}

class ASDF {
	public ASDF() {
		
	}
	
	public ASDF(int f) {
		method(1.1);
	}
	
	public void zxcv(double dd) {
		
	}
	
	private char method(double dd) {
		return 'a';
	}
}

class GenTest2 extends GenTest4 implements GenTest3{
	public static int st;
	private int member;
	private double m55 = 5.5;
	private ASDF as;
	
	public void main(String[] args) {
		int x = 7;
		mmmmm = method(1.1);
		char dd;
		dd = mmmmm;
		int d = x;
		int y = GenTest.st;
		method(m55);
	}
	
	private char method(double dd) {
		mmmmm = 'b';
		member = (int)dd;
		String asdf;
		System.out.println("Call=" + mmmmm);
		qwer(2.2);
		as = new ASDF(1);
		int d, x = 3;
		d=x;
		
		GenTest6[] gta6;
		gta6 = new GenTest5[5];
		
		GenTest6 gt6;
		gt6 = new GenTest5();
		
		int[] ddddd;
		
		
		ddddd = new int[4];
		
		
		ASDF LOCALVAR;
		LOCALVAR = new ASDF(1);
//		LOCALVAR.zxcv(1.1);
//		GenTest6.LOCALARG(LOCALVAR);
		ASDF AGN1;
//		AGN1 = LOCALVAR;
		ASDF AGN2 = LOCALVAR;
		
		GenTest8 <GenTest7> aa = new GenTest8();
//		GenTest9 aaaa = null;
//		aa.mtd(aaaa);
////		uiop();
		
		return 'a';
	}
	
	public void qwer(double dd) {
		
	}
	
//	public <T> void uiop(T aaa) {
//		
//	}
	
	private char mmmmm;
}

interface GenTest3 {
	
}

class GenTest4 <N> {
	public static void LOCALARG(ASDF asdf) {
		new GenTest10<GenTest11>() {
			int asdfg() {
				return 2;
			}
		};
		
		new GenTest12() {

			int asdfg2() {
				return 2;
			}
		};
		
		new GenTest13();
	}
}

class GenTest5 extends GenTest6{
	
}

class GenTest6 {
	public static void LOCALARG(ASDF asdf) {
	}
}

class GenTest7 {
	
}

class GenTest8 <N> {
	public <TT extends GenTest9> int mtd () {
		TT a;
		
		return 1;
	}
}

class GenTest9 {
	
}

class GenTest10 <T> {
	
}

class GenTest11 {
	int asdfg() {
		return 1;
	}
}

class GenTest12 {
	int asdfg2() {
		return 1;
	}
}

class GenTest13 {
	int asdfg2() {
		GenTest14.alsk();
		return 1;
	}
}

class GenTest14 {
	static int alsk() {
		ArrayList<Integer> aa;
		return 1;
	}
}