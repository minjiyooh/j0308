package t11_interface4;

public class AirPlane	implements Toy {
	private int age = 8;
	
	@Override
	public void age() {
		System.out.println(age + "세 이상 사용할 수 있습니다.");		
	}

	@Override
	public void moving() {
		System.out.println("팔/다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {System.out.println("레이저 발사 기능이 있습니다.");
	
	}

	@Override
	public void misaile() {System.out.println("미사일 발사 기능이 있습니다.");}

	@Override
	public int possibleAge() {
			return age;		
	}

}
