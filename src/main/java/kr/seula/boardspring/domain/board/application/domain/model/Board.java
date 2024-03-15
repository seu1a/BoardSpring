package kr.seula.boardspring.domain.board.application.domain.model;

import kr.seula.boardspring.domain.board.adapter.in.web.dto.CreateBoardDTO;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardDescription;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardId;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardTitle;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class Board {

    private BoardId id;

    private BoardTitle title;

    private BoardDescription description;

    public Board createBoard(CreateBoardDTO boardDTO) {
        return new Board(
                null,
                 new BoardTitle(boardDTO.getTitle()),
                new BoardDescription(boardDTO.getDescription())
        );
    }

}