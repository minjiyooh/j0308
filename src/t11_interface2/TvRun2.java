package t11_interface2;

public class TvRun2 {
	public static void main(String[] args) {
		Audio audio = new Audio();
		
		System.out.println("TV 최대 볼륨 : " + audio.MAX_VOLUMe);
		System.out.println("TV 최소 볼륨 : " + audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
		
		
	}
}
