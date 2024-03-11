package t11_interface1;

public class Busan implements Test1 { //인터페이스는 extends가 아니라 implements
	int min;
	@Override
	public void data() {
		System.out.println("이곳은 Busan 클래스의 data 메소드입니다.");

	}

	@Override
	public void data1(int su) {
		if(su <MIN) min = su;
		else min = MIN;
		System.out.println("최소값 : " + min);

	}

	@Override
	public void data2() {
		System.out.println("이곳은 Busan 클래스의 data 메소드입니다.");

	}

}
