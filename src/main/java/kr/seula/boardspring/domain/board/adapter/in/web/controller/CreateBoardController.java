package kr.seula.boardspring.domain.board.adapter.in.web.controller;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.CreateBoardDTO;
import kr.seula.boardspring.domain.board.application.port.in.CreateBoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class CreateBoardController {

    private final CreateBoardUseCase createBoardUseCase;

    @PostMapping("create")
    public String createBoard(@RequestBody CreateBoardDTO createBoardDTO){
        createBoardUseCase.createBoard(createBoardDTO);
        return "SUCCESS";
    }

}
