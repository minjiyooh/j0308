package t11_interface4;

public class Beer	implements Toy {
	private int age = 0;
	
	@Override
	public void age() {
		System.out.println("모든 연령대가 다 사용하실 수 있습니다.");
		
	}

	@Override
	public void moving() {
		System.out.println("팔/다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {
		System.out.println();
	}

	@Override
	public void misaile() {}

	@Override
	public int possibleAge() {
			return age;		
	}

}
