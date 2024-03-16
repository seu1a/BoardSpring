package kr.seula.boardspring.domain.board.adapter.in.web.controller;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.RetrieveBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.domain.service.RetrieveBoardService;
import kr.seula.boardspring.domain.board.application.port.in.RetrieveBoardUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
@AllArgsConstructor
public class RetrieveBoardController {

    private RetrieveBoardUseCase retrieveBoardUseCase;

    @PostMapping("retrieve")
    public Board retrieveBoard(@RequestBody RetrieveBoardDTO retrieveBoardDTO) {
        return retrieveBoardUseCase.retrieveBoard(retrieveBoardDTO);
    }

}
