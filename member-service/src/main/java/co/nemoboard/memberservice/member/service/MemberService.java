package co.nemoboard.memberservice.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.nemoboard.memberservice.member.dto.MemberCreateRequest;
import co.nemoboard.memberservice.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
	private final MemberRepository memberRepository;

	@Transactional
	public void registerMember(MemberCreateRequest request) {
		log.info("request is {}", request);
		memberRepository.save(request.toEntity());
	}
}
