package co.nemoboard.memberservice.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemoboard.api.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
