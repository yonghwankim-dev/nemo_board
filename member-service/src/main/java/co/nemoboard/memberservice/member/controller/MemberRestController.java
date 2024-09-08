package co.nemoboard.memberservice.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.nemoboard.memberservice.member.dto.MemberCreateRequest;
import co.nemoboard.memberservice.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberRestController {

	private final MemberService memberService;
	@PostMapping("/api/members/register")
	public ResponseEntity<Void> registerMember(@RequestBody MemberCreateRequest request) {
		memberService.registerMember(request);
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}

}
