package Chap07.h_p_Remotecontrol;
// �̰��� �ڹٴ� p.347~50
public interface h_RemoteControl {
	//���
	public int MAX_VOLUME = 10; //static final ���� �ڵ����� �پ�
	public int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	public void turnOn(); // abstract �� ���� �׷��� �Ƚᵵ�ǰ� �ᵵ��
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	
}
