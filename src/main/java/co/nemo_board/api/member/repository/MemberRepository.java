package co.nemo_board.api.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemo_board.api.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
