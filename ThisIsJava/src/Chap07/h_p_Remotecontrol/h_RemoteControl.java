package Chap07.h_p_Remotecontrol;
// 이것이 자바다 p.347~50
public interface h_RemoteControl {
	//상수
	public int MAX_VOLUME = 10; //static final 생략 자동으로 붙어
	public int MIN_VOLUME = 0;

	// 추상 메소드
	public void turnOn(); // abstract 가 생략 그래서 안써도되고 써도됨
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드
	
}
