package kr.seula.boardspring.domain.board.application.port.out;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.LoadBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.Board;

public interface LoadBoardPort {

    Board loadBoard(LoadBoardDTO boardDTO);

}
