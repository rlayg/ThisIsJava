package Chap15.d_p737_HashSetExample;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p739
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü��: "+set.size());

	}

}
