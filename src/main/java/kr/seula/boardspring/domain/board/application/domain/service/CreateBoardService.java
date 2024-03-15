package kr.seula.boardspring.domain.board.application.domain.service;

import jakarta.transaction.Transactional;
import kr.seula.boardspring.domain.board.adapter.in.web.dto.CreateBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.port.in.CreateBoardUseCase;
import kr.seula.boardspring.domain.board.application.port.out.SaveBoardPort;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class CreateBoardService implements CreateBoardUseCase {

    private SaveBoardPort saveBoardPort;

    @Override
    public void createBoard(CreateBoardDTO boardDTO) {
        saveBoardPort.saveBoard(
                Board.createBoard(boardDTO)
        );
    }

}
