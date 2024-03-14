package kr.seula.boardspring.domain.board.adapter.out.persistence;

import kr.seula.boardspring.domain.board.adapter.out.persistence.mapper.BoardMapper;
import kr.seula.boardspring.domain.board.adapter.out.persistence.repository.BoardRepository;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.port.out.SaveBoardPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardPersistenceAdapter implements SaveBoardPort {

    private BoardRepository boardRepository;
    private BoardMapper boardMapper;

    @Override
    public void saveBoard(Board board) {
        boardRepository.save(
                boardMapper.returnBoardEntityWithoutId(board)
        );
    }
}
