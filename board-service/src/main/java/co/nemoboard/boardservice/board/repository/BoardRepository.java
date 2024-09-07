package co.nemoboard.boardservice.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemoboard.api.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
