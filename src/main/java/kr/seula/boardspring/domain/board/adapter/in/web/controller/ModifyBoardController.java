package kr.seula.boardspring.domain.board.adapter.in.web.controller;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.ModifyBoardDTO;
import kr.seula.boardspring.domain.board.application.port.in.ModifyBoardUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
@AllArgsConstructor
public class ModifyBoardController {

    private final ModifyBoardUseCase modifyBoardUseCase;

    @PostMapping("modify")
    public String modifyBoard(@RequestBody ModifyBoardDTO modifyBoardDTO) {
        modifyBoardUseCase.modifyBoard(modifyBoardDTO);
        return "SUCCESS";
    }

}
