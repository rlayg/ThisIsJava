package Chap11.f_p498_507_StringSubstringExample;

public class StringSubstringExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p507
		String str4 = "�ڹ� ���α׷���";
		System.out.println(str4.charAt(4));
		System.out.println(str4.indexOf('��'));
		System.out.println(str4.indexOf("�׷���"));
		System.out.println(str4.length());
		
		System.out.println(str4.replace("�ڹ�", "--"));
		
		System.out.println(str4.substring(0, 2));
		System.out.println(str4.substring(3, 8));
		System.out.println(str4.substring(3));

		String str5 = "   Good Morning    ";
		System.out.println(str5.toLowerCase());
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase().toUpperCase()); //�ҹ����ߴٰ��빮�ڷιٲ��
		System.out.println(str5.trim()); //�翷 ���� ������
		System.out.println(str5.strip()); //�翷 ���� ������
		
		System.out.println(String.valueOf(10)); // ���ڿ� ��ȯ
		
		

	}

}
