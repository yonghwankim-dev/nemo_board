package co.nemo_board.api.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nemo_board.api.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
