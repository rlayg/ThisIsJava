package Chap15.d_p737_HashSetExample;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		// ÀÌ°ÍÀÌ ÀÚ¹Ù´Ù p739
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 30));
		
		System.out.println("ÃÑ °´Ã¼¼ö: "+set.size());

	}

}
