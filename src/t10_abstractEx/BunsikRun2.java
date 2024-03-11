package t10_abstractEx;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangJaBunsik wangJaBunsik = new WangJaBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WooJuBunsik wooJuBunsik = new WooJuBunsik();
		
//		Bonsa wangJaBunsik = new WangJaBunsik();
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa wooJuBunsik = new WooJuBunsik();
//		Bonsa[] bonsas = {wangJaBunsik, seoulBunsik, wooJuBunsik};
		
		Bonsa[] bonsas = {new WangJaBunsik(), new SeoulBunsik(), new WooJuBunsik()};
		
		for(int i=0; i<bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].konggi();
			System.out.println("=======================================");
		}
		
		/*
		wangJaBunsik.getShopName();
		wangJaBunsik.kimchi();
		wangJaBunsik.budae();
		wangJaBunsik.bibim();
		wangJaBunsik.sundae();
		wangJaBunsik.konggi();
		System.out.println("=======================================");
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=======================================");
		
		wooJuBunsik.getShopName();
		wooJuBunsik.kimchi();
		wooJuBunsik.budae();
		wooJuBunsik.bibim();
		wooJuBunsik.sundae();
		wooJuBunsik.konggi();
		System.out.println("=======================================");
		*/
	}
}
