package t6_polymorphism;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		
		Bb bb = new Bb();
		Aa ba = bb;					// #1
		Aa ba2 = new Bb();	// #2
		
		Cc cc = new Cc();
		Aa ca = cc;
		Aa ca2 = new Cc();
		
		Dd dd = new Dd();
		Bb db = new Dd();
		Aa da = new Dd();
		
		Ee ee = new Ee();
		Cc ec = new Ee();
		Aa ea = new Ee();
	}
}
