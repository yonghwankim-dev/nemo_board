package co.nemoboard.boardservice.board.dto;

import co.nemoboard.boardservice.board.entity.Board;
import co.nemoboard.boardservice.memberinfo.entity.MemberInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardCreateRequest {
	private String title;
	private String content;
	@Getter
	private Long memberId;

	public Board toEntity(MemberInfo memberInfo) {
		return new Board(title, content, memberInfo);
	}
}
