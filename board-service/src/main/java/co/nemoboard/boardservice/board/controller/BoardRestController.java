package co.nemoboard.boardservice.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.nemoboard.boardservice.board.dto.BoardCreateRequest;
import co.nemoboard.boardservice.board.entity.Board;
import co.nemoboard.boardservice.board.service.BoardService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardRestController {

	private final BoardService service;

	@PostMapping("/api/boards")
	public ResponseEntity<Board> createBoard(@RequestBody BoardCreateRequest request) {
		Board board = service.saveBoard(request);
		return ResponseEntity.status(HttpStatus.CREATED.value())
			.contentType(MediaType.APPLICATION_JSON)
			.body(board);
	}
}
