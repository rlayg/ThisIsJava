package Chap06.h_class_p232;

public class h_CalculatorExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p. 232 �żҵ�����ε�
		ha_Calculator myCalcu = new ha_Calculator();
		
		//������� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//�����Կ� �ϳ� �� ���ڵڿ� .0 ���ַ� 
		int result3 = myCalcu.areaRectangle(10, 12);
		//��� ���
		System.out.println("���簢���� ����= "+result1);
		System.out.println("���簢���� ����= "+result2);
		System.out.println("���簢���� ����= "+result3);
	}//���ڰ��� �Ӹ� �ƴ϶� ������ Ÿ�Ե� �ٸ��� ���鶧���� �� ���� ��������

}
