package t10_abstractEx;

public class WooJuBunsik extends Bonsa {

	public WooJuBunsik() {
		super("우주분식", 6000, 7000, 7000, 6000, 1000);
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌게 : " + kimchi);
	}

	@Override
	public void budae() {
		System.out.println("부대찌게 : " + budae);
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : " + bibim);
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : " + sundae);
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : " + konggi);
	}

}
