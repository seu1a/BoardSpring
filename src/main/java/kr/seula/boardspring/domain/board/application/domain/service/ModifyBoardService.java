package kr.seula.boardspring.domain.board.application.domain.service;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.ModifyBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardDescription;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardId;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardTitle;
import kr.seula.boardspring.domain.board.application.port.in.ModifyBoardUseCase;
import kr.seula.boardspring.domain.board.application.port.out.EditBoardPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModifyBoardService implements ModifyBoardUseCase {

    private final EditBoardPort editBoardPort;

    @Override
    public void modifyBoard(ModifyBoardDTO boardDTO) {
        editBoardPort.editBoard(
                Board.builder()
                        .id(new BoardId(boardDTO.getId()))
                        .title(new BoardTitle(boardDTO.getTitle()))
                        .description(new BoardDescription(boardDTO.getDescription()))
                        .build()
        );
    }

}
