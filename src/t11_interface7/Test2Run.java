package t11_interface7;

public class Test2Run {
	public static void main(String[] args) {
		// new Test2();  // 인터페이스를 생성(?)하려면? 익명구현객체를 사용해서 가능하다.
		
		// 익명구현객체에 구현할 메소드를 만들어준다.
		Test2 t22 = new Test2() {
			int atom = 200;
			public void abc() {
				int temp = atom;
				System.out.println("이곳은 Test2Run의 클래스의 t22익명객체안의 abc()메소드입니다.");
			}
		};
		
		Test2 t23 = new Test2() {
			public void abc() {
				System.out.println("이곳은 Test2Run의 클래스의 t23익명객체안의 abc()메소드입니다.");
			}
		};
		
		// 익명객체안의 메소드 호출하기
		t22.abc();
		// 인터페이스 변수로 익명객체안의 필드와 일반변수에 접근 불가이다
		//System.out.println("atom : " + t22.atom);
		//System.out.println("temp : " + t22.atom().temp);
		t23.abc();
		
		if(t22 == t23) System.out.println("같은 객체를 가리킵니다.");
		else System.out.println("서로 다른 객체를 가리킵니다.");
	}
}
