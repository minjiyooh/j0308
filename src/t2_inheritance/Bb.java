package t2_inheritance;

public class Bb extends Aa {
	int su = item1;

	public Bb() {
		super(10); // 첫번째에 와야함 왜냐하면 부모를 젤먼저 보고 하기때문에
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}

	public Bb(int su) {

		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자1, su = " + su);
	}
	
	public Bb(int item1, int x, int y) {
		super(item1, x, y);
	}

//사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적: (윗변:" + x + ",아래변:" + y + " ,높이:" + z + ")" + area);
	}
}
