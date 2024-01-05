package org.jjang.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.jjang.day10.oop.member.model.vo.Member;

public class MemberController {
	// Member List 저장소
	List<Member> memberList;

	public MemberController() {
		memberList = new ArrayList<Member>();
	}

	// 회원 정보 등록
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		memberList.add(member);
	}

	// 회원 정보 수정
	public void modifyMember(String memberId, Member updateMember) {
		// TODO Auto-generated method stub
		for (int i = 0; i < memberList.size(); i++) {
			// ======= 원래 저장되어 있는 데이터 =====
			Member member = memberList.get(i);
			// ===== 입력한 id와 같은지 비교 =====
			if (memberId.equals(member.getMemberId())) {
				// ======= 입력 받은 데이터로 수정 =======
				member.setMemberPw(updateMember.getMemberPw());
				member.setMemberEmail(updateMember.getMemberEmail());
				member.setMemberPhone(updateMember.getMemberPhone());

				// ======= 수정된 데이터로 저장 =======
				memberList.set(i, member);
			}
		}
	}

	// 회원 정보 삭제
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		// for(Member member : memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (memberId.equals(member.getMemberId())) {
				memberList.remove(i);
				break;
			}
		}
	}

	// 회원 전체 정보
	public List<Member> printAllMembers() {
		return memberList;
	}

	// 회원 정보 아이디로 검색
	public Member printOneById(String memberId) {
		// TODO Auto-generated method stub
		for (Member member : memberList) {
			if (memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}

}
