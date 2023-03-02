package Chap10.f_p434_CatchByExceptionkind;

public class CatchByExceptionkind {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p434
		try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 +"=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionkind num1 num2");
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
	/*
	 * �ΰ��� ���� �Ű����� ���� ����
	 *
	 * Run configuration - Arguments - program arguments - 
	 * �� �� - �̷��� �� �ָ� �� ����
	 * �� ���ְų� �ϳ��� ���൵ ���ܹ߻�
	 * 
	 * �ٵ� ���� �� �� ���� �ָ� �ؿ� ���ܰ� �߻�
	 * 
	 * ���� 2�� ������ ���� �����ϰ� �ٽ� �����ϼ��䰡 ��µǳ�
	 * e_ �� ������ 
	 * �ʹݿ� ���� �߻��ϸ� �ؿ��� �� ���� �� ���ε��� ���������
	 * ����ó��  try�� �� ���ε��� �־������
	 */
}
