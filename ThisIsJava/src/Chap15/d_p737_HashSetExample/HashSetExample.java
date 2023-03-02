package Chap15.d_p737_HashSetExample;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p737
		
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		Iterator<String> iterator = set.iterator();
		//�ݺ��� ���
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: "+set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("�������");}

	}

}
