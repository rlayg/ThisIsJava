package Chap06.n_class_p267;

public class na_Car {
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ�
	public int getSpeed() { //���� ���´�
		return speed;
	}
	public void setSpeed(int speed) { // set �������ش� ���� �����ش�
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
