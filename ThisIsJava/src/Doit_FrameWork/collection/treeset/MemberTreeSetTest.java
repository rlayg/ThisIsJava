package Doit_FrameWork.collection.treeset;

import Doit_FrameWork.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
	}

}
