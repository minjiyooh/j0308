package t11_interface2;

public interface Remote {
	public static final int MAX_VOLUMe = 10;
	int MIN_VOLUME = 0;
	
	public abstract void switchOn();
	void switchOff();
	
	void remoteName(String name);
}
