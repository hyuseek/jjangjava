package org.jjang.day09.collection.member.model;

public class Member {
	// memberId
	// memberPw
	// memberName
	// memberEmail
	// memberPhone
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String email;
	private String phone;
	
	public Member() {}
	
	public Member(String memberId, String memberPw, String memberName, String email, String phone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
	}
	
	//setter 메소드
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberName() {
		return this.memberName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
}
