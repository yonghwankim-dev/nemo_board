package co.nemo_board.api.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.nemo_board.api.board.dto.BoardCreateRequest;
import co.nemo_board.api.board.entity.Board;
import co.nemo_board.api.board.repository.BoardRepository;
import co.nemo_board.api.member.entity.Member;
import co.nemo_board.api.member.repository.MemberRepository;
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
