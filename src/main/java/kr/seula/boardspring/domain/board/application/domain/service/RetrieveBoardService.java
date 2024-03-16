package kr.seula.boardspring.domain.board.application.domain.service;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.RetrieveBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.port.in.RetrieveBoardUseCase;
import kr.seula.boardspring.domain.board.application.port.out.LoadBoardPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RetrieveBoardService implements RetrieveBoardUseCase {

    private LoadBoardPort loadBoardPort;

    @Override
    public Board retrieveBoard(RetrieveBoardDTO boardDTO) {
        return loadBoardPort.loadBoard(boardDTO.getId());
    }

}
