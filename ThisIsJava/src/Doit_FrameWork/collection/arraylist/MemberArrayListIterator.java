package Doit_FrameWork.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import Doit_FrameWork.collection.Member;

public class MemberArrayListIterator { 
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayListIterator() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(memberId == tempId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
			
		}
//		���� for �����°Ŷ� iterator �����°Ŷ� �Ȱ���
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
//		System.out.println(arrayList);
	}

}
