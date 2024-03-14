package kr.seula.boardspring.domain.board.application.port.out;

import kr.seula.boardspring.domain.board.application.domain.model.Board;

public interface SaveBoardPort {

    void saveBoard(Board board);

}
