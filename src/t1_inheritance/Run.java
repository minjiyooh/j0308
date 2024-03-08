package t1_inheritance;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1.");
		a.areRec(10, 20);

		B b = new B();
		System.out.print("2.");
		b.areRec(20, 30);

		B c = new B();
		System.out.print("3.");
		c.areRec(30, 40);

		D d = new D();
		System.out.print("4.");
		d.areRec(30, 50);

		E e = new E();
		System.out.print("5.");
		e.areRec(50, 60);
		
		b.areaPoly(10, 20, 5);
		d.areaPoly(10, 20, 5);
	}
}
