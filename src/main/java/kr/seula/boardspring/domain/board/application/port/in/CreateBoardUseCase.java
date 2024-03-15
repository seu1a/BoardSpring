package kr.seula.boardspring.domain.board.application.port.in;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.CreateBoardDTO;

public interface CreateBoardUseCase {

    void createBoard(CreateBoardDTO createBoardDTO);

}
