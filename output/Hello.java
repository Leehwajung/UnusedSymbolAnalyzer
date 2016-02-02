import java.util.ArrayList;

public class Hello {
    private int member;
    
    public static void main(String[] args) { int x; }
    
    public Hello() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452836788187L;
    public static final String jlc$ClassType$jl7 =
      ("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" +
       "vrXupYnzvCH8Fx7PO/9PEQAA");
}

class Box<E> {
    private E elem;
    
    public E get() { return elem; }
    
    public void set(E elem) { this.elem = elem; }
    
    public <T> boolean isEmpty(Box<T> e2) { return elem == null; }
    
    public Box() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452836788187L;
    public static final String jlc$ClassType$jl7 =
      ("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" +
       "phUAAA==");
}
