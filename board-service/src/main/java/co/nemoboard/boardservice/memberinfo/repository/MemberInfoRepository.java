package co.nemoboard.boardservice.memberinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemoboard.boardservice.memberinfo.entity.MemberInfo;

public interface MemberInfoRepository extends JpaRepository<MemberInfo, Long> {
}
