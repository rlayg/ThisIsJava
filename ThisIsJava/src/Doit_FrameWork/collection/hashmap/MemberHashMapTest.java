package Doit_FrameWork.collection.hashmap;

import Doit_FrameWork.collection.Member;
import Doit_FrameWork.collection.treeset.MemberTreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
	MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberShin);
		
		memberHashMap.showAllMember();
		System.out.println();
		
		memberHashMap.removeMember(102);
		memberHashMap.showAllMember();
	}
//HashMap 이니까 순서는 상관없어
}
