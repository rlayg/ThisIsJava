package Chap15.a_p728_ArrayListExample;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p728
		List<String> list= new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		//��ü ����
		
		int size = list.size();
		//����� �� ��ü �� ���	
		System.out.println("�� ��ü��: "+size);
		System.out.println();
		
		String skill = list.get(2);
		//2�� �ε��� ��ü ���
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+str);
			//����� �� ��ü ����ŭ ����
		}
		System.out.println();
		
		//�ε��� ����
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+str);
			//����� �� ��ü ����ŭ ����
		
		System.out.println();
		
		for (String str1 : list) {
			System.out.println(str1);
		}
			
		}
		
	}

}
