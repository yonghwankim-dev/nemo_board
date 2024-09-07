package co.nemoboard.memberservice.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemoboard.memberservice.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
