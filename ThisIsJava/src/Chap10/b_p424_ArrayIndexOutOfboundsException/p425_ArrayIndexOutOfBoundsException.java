package Chap10.b_p424_ArrayIndexOutOfboundsException;

public class p425_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p425
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[���� ���]");
			System.out.println("java Array IndexOutOfBoundsException");
			System.out.println("��1 ��2");
		}
	}
}
/*
 *������ �̷��� �����ϸ�  ArrayIndexOutOfBoundsException
 *�� �߻����� �ʴ� ���α׷��� ��
 *�迭���� �б� ���� �迭�� ���̸� ���� �����ϴ� ��
 *���� �Ű����� ���ų� �����ϸ� ���ǹ��� �̿��ؼ� ����ڿ��� �������� �˷���
 */

