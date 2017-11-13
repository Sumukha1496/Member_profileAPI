package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Controller
@RestController
public class MemberController {
	
	@Autowired
	private MemberServices memberService;
	
	
	@RequestMapping("/members")
	public List<Member> getallMembers() {
		return memberService.getAllMembers();
	}
	
	@RequestMapping("/members/{id}")
	public Member getMemberUsingId(@PathVariable String id) {
		return memberService.getMember(id);
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	@RequestMapping(value="/members", method=RequestMethod.POST)
	public void addMembers(@RequestBody Member member) {
		memberService.addMember(member);
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	@RequestMapping(value="/members/{id}", method=RequestMethod.PUT)
	public void updateMembers(@RequestBody Member member, @PathVariable String id) {
		memberService.updateMember(id, member);
	}
	
	@RequestMapping(value="/members/{id}", method=RequestMethod.DELETE)
	public void deleteMemberUsingId(@PathVariable String id) {
		 memberService.deleteMember(id);
	}
	
}
