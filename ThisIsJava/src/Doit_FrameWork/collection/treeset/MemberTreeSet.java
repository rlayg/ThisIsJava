package Doit_FrameWork.collection.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import Doit_FrameWork.collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet(){
		treeSet = new TreeSet<Member>();
	}
	public void addMember(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
		Member member = iterator.next();
		
		int temId = member.getMemberId();
		if(memberId == temId) {
			treeSet.remove(member);
			return true;
		}
	}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	public void showAll() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
