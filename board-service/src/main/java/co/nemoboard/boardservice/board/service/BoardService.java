package co.nemoboard.boardservice.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.nemoboard.boardservice.board.dto.BoardCreateRequest;
import co.nemoboard.boardservice.board.entity.Board;
import co.nemoboard.boardservice.board.repository.BoardRepository;
import co.nemoboard.boardservice.memberinfo.entity.MemberInfo;
import co.nemoboard.boardservice.memberinfo.repository.MemberInfoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository repository;
	private final MemberInfoRepository memberInfoRepository;

	@Transactional
	public Board saveBoard(BoardCreateRequest request) {
		MemberInfo memberInfo = memberInfoRepository.save(new MemberInfo(request.getMemberId()));
		return repository.save(request.toEntity(memberInfo));
	}
}
