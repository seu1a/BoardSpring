package kr.seula.boardspring.domain.board.application.port.in;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.RetrieveBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;

public interface RetrieveBoardUseCase {

    Board retrieveBoard(RetrieveBoardDTO boardDTO);

}
