package kr.seula.boardspring.domain.board.application.domain.service;

import jakarta.transaction.Transactional;
import kr.seula.boardspring.domain.board.adapter.in.web.dto.RemoveBoardDTO;
import kr.seula.boardspring.domain.board.application.port.in.RemoveBoardUseCase;
import kr.seula.boardspring.domain.board.application.port.out.DeleteBoardPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class RemoveBoardService implements RemoveBoardUseCase {

    private DeleteBoardPort deleteBoardPort;

    @Override
    public void removeBoard(RemoveBoardDTO boardDTO) {
        deleteBoardPort.deleteBoard(boardDTO.getId());
    }

}
