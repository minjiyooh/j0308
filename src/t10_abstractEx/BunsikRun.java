package t10_abstractEx;

public class BunsikRun {
	public static void main(String[] args) {
		WangJaBunsik wangJaBunsik = new WangJaBunsik();
		wangJaBunsik.getShopName();
		wangJaBunsik.kimchi();
		wangJaBunsik.budae();
		wangJaBunsik.bibim();
		wangJaBunsik.sundae();
		wangJaBunsik.konggi();
		System.out.println("=======================================");
		
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=======================================");
		
		WooJuBunsik wooJuBunsik = new WooJuBunsik();
		wooJuBunsik.getShopName();
		wooJuBunsik.kimchi();
		wooJuBunsik.budae();
		wooJuBunsik.bibim();
		wooJuBunsik.sundae();
		wooJuBunsik.konggi();
		System.out.println("=======================================");
		
	}
}
