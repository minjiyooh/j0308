package t2_inheritance;

// 클래스 = 스레드 
public class Run {
	public static void main(String[] args) {
		System.out.println("1.이곳은 Run클래스 입니다.");

		Bb bb1 = new Bb(); // Bb가 생성되는순간 힙에 Aa도 생성이됨 // this. ->필드 this() ->생성자

		bb1.areaRec(10, 20); // Aa가 먼저 생성이됨
		bb1.areaPoly(1, 2, 3); // ()안에 아무것도 안부르면 기본적으로 기본생성자를 부름.
		System.out.println(); // 안에 값을 넣으면 사용자 정의 생성자가 나옴

		Bb bb2 = new Bb(10);
		bb2.areaPoly(2, 3, 4);
		System.out.println();

		Bb bb3 = new Bb(10,20,30); //민아씨질문
		System.out.println();
		
		System.out.println("2. 이곳은 Run클래스 입니다.");

	}
}
