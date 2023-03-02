package Chap06.n_class_p267;

public class na_Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public int getSpeed() { //값을 얻어온다
		return speed;
	}
	public void setSpeed(int speed) { // set 셋팅해준다 값을 정해준다
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
