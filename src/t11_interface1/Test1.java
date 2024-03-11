package t11_interface1;

public interface Test1 { // 인터페이스에서 사용할 때

	// int max = 1000000;
	int max = 1000000;
	int MAX = 1000000; // 상수라 대문자로 써야함 실무가면 이렇게씀
	public static final int MIN = 0;

	void data();
	void data1(int su);

	public abstract void data2();

	default void data3() { // default 라 중괄호를 써줘야함.
// 실행할 내용을 포함/생략
		System.out.println("이곳은 data3 메소드");
	}

	static void data4() { // 실행블록이 있어야함 static 이 있어서
		// 실행할 내용을 포함
		System.out.println("이곳은 data4 메소드(static)");
	}
}
