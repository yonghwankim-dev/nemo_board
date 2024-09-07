package co.nemo_board.api.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.nemo_board.api.board.dto.BoardCreateRequest;
import co.nemo_board.api.board.entity.Board;
import co.nemo_board.api.board.service.BoardService;
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
