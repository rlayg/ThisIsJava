package Chap15.a_p728_ArrayListExample;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// 이것이 자바다 p728
		List<String> list= new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		//객체 저장
		
		int size = list.size();
		//저장된 총 객체 수 얻기	
		System.out.println("총 객체수: "+size);
		System.out.println();
		
		String skill = list.get(2);
		//2번 인덱스 객체 얻기
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+str);
			//저장된 총 객체 수만큼 루핑
		}
		System.out.println();
		
		//인덱스 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+str);
			//저장된 총 객체 수만큼 루핑
		
		System.out.println();
		
		for (String str1 : list) {
			System.out.println(str1);
		}
			
		}
		
	}

}
