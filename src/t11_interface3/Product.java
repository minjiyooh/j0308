package t11_interface3;

public class Product implements Remote {
	int volume;
	@Override
	public void switchOn(String name) {
		System.out.println(name + " 전원을 켭니다.");
	}

	@Override
	public void switchOff(String name) {
		System.out.println(name + " 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println("선택하신 제품은 : " + name);
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력하신 현재 볼륨은? " + volume);
		if(volume > MAX_VOLUME) {
			System.out.println("최대볼륨은 10 입니다.");
			volume = MAX_VOLUME;
		}
		else if (volume < MIN_VOLUME) {
			System.out.println("최소의 볼륨은 ");
		}
	}

}
