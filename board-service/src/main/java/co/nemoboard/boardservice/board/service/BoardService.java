package co.nemoboard.boardservice.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.nemoboard.api.board.dto.BoardCreateRequest;
import co.nemoboard.api.board.entity.Board;
import co.nemoboard.api.board.repository.BoardRepository;
import co.nemoboard.api.member.entity.Member;
import co.nemoboard.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository repository;
	private final MemberRepository memberRepository;

	@Transactional
	public Board saveBoard(BoardCreateRequest request) {
		Member member = memberRepository.findById(request.getMemberId()).orElseThrow();
		return repository.save(request.toEntity(member));
	}
}
