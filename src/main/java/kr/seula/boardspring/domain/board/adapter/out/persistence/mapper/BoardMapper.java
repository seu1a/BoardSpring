package kr.seula.boardspring.domain.board.adapter.out.persistence.mapper;

import kr.seula.boardspring.domain.board.adapter.out.persistence.entity.BoardEntity;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
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

}
