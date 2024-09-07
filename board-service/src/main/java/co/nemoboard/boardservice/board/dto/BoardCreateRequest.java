package co.nemoboard.boardservice.board.dto;

import co.nemoboard.api.board.entity.Board;
import co.nemoboard.api.member.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardCreateRequest {
	private String title;
	private String content;
	@Getter
	private Long memberId;

	public Board toEntity(Member member) {
		return new Board(title, content, member);
	}
}
