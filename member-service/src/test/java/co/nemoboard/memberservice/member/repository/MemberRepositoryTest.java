package co.nemoboard.memberservice.member.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.nemoboard.common.RepositoryTest;
import co.nemoboard.memberservice.member.entity.Member;

class MemberRepositoryTest extends RepositoryTest {

	@Autowired
	private MemberRepository repository;

	@DisplayName("사용자는 회원을 저장한다")
	@Test
	void save(){
	    // given
		Member member = new Member("kim");
		// when
		Member kim = repository.save(member);
		// then
		Assertions.assertThat(kim).isNotNull();
	}
}
