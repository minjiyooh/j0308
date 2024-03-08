package t3_override;

public class Cc extends Aa{
//부모 메소드를 재정의해서 씀 = 오버라이드
	
	
//원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+ r +" 인 원넓이는 ? " + area);
//	
	
//원넓이
//	public void areaCircle(int r) {//오버로딩 위반
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+ r +" 인 원넓이는 ? " + area); 
//	}
	
	public void areaCircle2(int r) {// 오버로딩은 리턴타입안봄 선언부가 같고 리턴타입이 같아야 오버라이딩
		double area = r * r * 3.14;
		System.out.println("반지름 "+ r +" 인 원넓이는 ? " + area); 
	
	
	}
}
