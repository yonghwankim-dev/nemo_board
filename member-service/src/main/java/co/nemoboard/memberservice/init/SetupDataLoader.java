package co.nemoboard.memberservice.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import co.nemoboard.memberservice.member.entity.Member;
import co.nemoboard.memberservice.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private final MemberRepository repository;
	private boolean alreadySetup = false;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (alreadySetup){
			return;
		}
		repository.save(new Member("kim"));
		alreadySetup = true;
	}
}
