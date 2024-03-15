package kr.seula.boardspring.domain.board.adapter.out.persistence.repository;

import kr.seula.boardspring.domain.board.adapter.out.persistence.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
