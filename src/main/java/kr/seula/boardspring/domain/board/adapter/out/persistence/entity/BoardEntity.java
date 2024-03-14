package kr.seula.boardspring.domain.board.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Builder
    public BoardEntity(
            Long id,
            String title,
            String description
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

}
