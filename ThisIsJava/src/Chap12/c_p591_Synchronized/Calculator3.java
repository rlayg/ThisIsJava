package Chap12.c_p591_Synchronized;

public class Calculator3 {
	//p 592
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { // ���� synchronized ����
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory); // �������̸�, �޸� ��
	}
}

//������ Calculator ����ȭ �̿�Ȱ� ���
