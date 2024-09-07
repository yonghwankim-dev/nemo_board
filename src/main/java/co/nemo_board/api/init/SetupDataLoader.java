package co.nemo_board.api.init;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.nemo_board.api.board.entity.Board;
import co.nemo_board.api.board.repository.BoardRepository;
import co.nemo_board.api.member.entity.Member;
import co.nemo_board.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private boolean alreadySetup = false;
	private final MemberRepository memberRepository;
	private final BoardRepository boardRepository;

	@Transactional
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (alreadySetup) {
			return;
		}
		Member kim = memberRepository.save(new Member("kim"));
		boardRepository.save(new Board("title1", "content1", kim));
		alreadySetup = true;
	}
}
