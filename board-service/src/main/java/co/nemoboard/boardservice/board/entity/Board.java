package co.nemoboard.boardservice.board.entity;

import co.nemoboard.boardservice.memberinfo.entity.MemberInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_info_id", nullable = false)
	private MemberInfo memberInfo;

	public Board(String title, String content, MemberInfo memberInfo) {
		this.title = title;
		this.content = content;
		this.memberInfo = memberInfo;
	}
}
