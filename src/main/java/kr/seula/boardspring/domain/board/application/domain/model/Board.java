package kr.seula.boardspring.domain.board.application.domain.model;

import kr.seula.boardspring.domain.board.application.domain.model.value.BoardDescription;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardId;
import kr.seula.boardspring.domain.board.application.domain.model.value.BoardTitle;
import lombok.Getter;

@Getter
public class Board {

    private BoardId id;

    private BoardTitle title;

    private BoardDescription description;

}