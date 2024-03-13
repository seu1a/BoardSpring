package kr.seula.boardspring.domain.board.application.domain.model;

import kr.seula.boardspring.domain.board.application.domain.model.value.UserID;
import kr.seula.boardspring.domain.board.application.domain.model.value.Username;
import lombok.Getter;

@Getter
public class Board {

    private UserID id;

    private Username username;

}