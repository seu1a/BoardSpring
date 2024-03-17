package kr.seula.boardspring.domain.board.application.port.in;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.ModifyBoardDTO;

public interface ModifyBoardUseCase {

    void modifyBoard(ModifyBoardDTO BoardDTO);

}
