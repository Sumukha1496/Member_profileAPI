package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MemberServices {
	private List<Member> members = new ArrayList<>(Arrays.asList(
			new Member("1", "Sumukha1"),
			new Member("2", "Sumukha2"),
			new Member("3", "Sumukha3"),
			new Member("4", "Sumukha4")
	));
	
	public List<Member> getAllMembers() {
		return members;
	}
	
	public Member getMember(String id) {
		return members.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void updateMember(String id, Member member) {
		for(int i = 0; i < members.size(); i++) {
			Member m = members.get(i);
			if(m.getId().equals(id)) {
				members.set(i, member);
			}
		}
	}
	
	public void deleteMember(String id) {
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if(member.getId().equals(id)) {
				members.remove(i);
			}
		}
	}
}
