package kr.seula.boardspring.domain.board.adapter.out.persistence.mapper;

import kr.seula.boardspring.domain.board.adapter.out.persistence.entity.BoardEntity;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardDescription;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardId;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardTitle;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {

    public BoardEntity returnBoardEntityWithoutId(Board board) {
        return BoardEntity.builder()
                .id(null)
                .title(board.getTitle().getValue())
                .description(board.getDescription().getValue())
                .build();
    }

    public Board returnBoardEntityToBoard(BoardEntity board) {
        return Board.builder()
                .id(new BoardId(board.getId()))
                .title(new BoardTitle(board.getTitle()))
                .description(new BoardDescription(board.getDescription()))
                .build();
    }

}
