package co.nemoboard.memberservice.member.dto;

import co.nemoboard.memberservice.member.entity.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberCreateRequest {
	private String name;

	public Member toEntity(){
		return new Member(name);
	}
}
