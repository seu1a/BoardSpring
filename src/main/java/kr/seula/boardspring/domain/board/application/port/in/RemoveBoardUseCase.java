package kr.seula.boardspring.domain.board.application.port.in;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.RemoveBoardDTO;

public interface RemoveBoardUseCase {

    void removeBoard(RemoveBoardDTO boardDTO);

}
