package Doit_FrameWork.collection.arraylist;

import Doit_FrameWork.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee); 
		memberArrayList.addMember(memberKim); 
		memberArrayList.addMember(memberShin); 
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAll();
		
		System.out.println();
		
		MemberArrayListIterator memberArrayListIterator = new MemberArrayListIterator();
		
		Member imemberLee = new Member(101, "�̼���");
		Member imemberKim = new Member(102, "������");
		Member imemberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(imemberLee); 
		memberArrayList.addMember(imemberKim); 
		memberArrayList.addMember(imemberShin); 
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(imemberKim.getMemberId());
		
		memberArrayList.showAll();
		
	}

}
