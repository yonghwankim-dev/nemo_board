package co.nemo_board.api.board.dto;

import co.nemo_board.api.board.entity.Board;
import co.nemo_board.api.member.entity.Member;
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
