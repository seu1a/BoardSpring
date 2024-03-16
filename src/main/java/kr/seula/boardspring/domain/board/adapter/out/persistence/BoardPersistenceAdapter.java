package kr.seula.boardspring.domain.board.adapter.out.persistence;

import kr.seula.boardspring.domain.board.adapter.out.persistence.mapper.BoardMapper;
import kr.seula.boardspring.domain.board.adapter.out.persistence.repository.BoardRepository;
import kr.seula.boardspring.domain.board.application.domain.model.Board;
import kr.seula.boardspring.domain.board.application.port.out.LoadBoardPort;
import kr.seula.boardspring.domain.board.application.port.out.SaveBoardPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BoardPersistenceAdapter implements SaveBoardPort, LoadBoardPort {

    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    @Override
    public void saveBoard(Board board) {
        boardRepository.save(
                boardMapper.returnBoardEntityWithoutId(board)
        );
    }

    @Override
    public Board loadBoard(long id) {
        return boardMapper.returnBoardEntityToBoard(
                boardRepository.findById(id).get()
        );
    }
}
