package kr.seula.boardspring.domain.board.application.domain.model;

import kr.seula.boardspring.domain.board.application.domain.model.value.BoardId;
import lombok.Getter;

@Getter
public class Board {

    private BoardId id;

    private Title title;

}