package Doit_FrameWork.collection.treeset;

import Doit_FrameWork.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberShin = new Member(103, "�Ż���");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
	}

}
