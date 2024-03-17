package kr.seula.boardspring.domain.board.adapter.in.web.controller;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.RemoveBoardDTO;
import kr.seula.boardspring.domain.board.application.port.in.RemoveBoardUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("board")
public class RemoveBoardController {

    private RemoveBoardUseCase removeBoardUseCase;

    @PostMapping("remove")
    public String removeBoard(@RequestBody RemoveBoardDTO removeBoardDTO) {
        removeBoardUseCase.removeBoard(removeBoardDTO);
        return "SUCCESS";
    }

}
