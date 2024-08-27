package kr.ac.kopo.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board")
public class Reply extends BaseEntity{

    @Id // 기본키 (primary key) 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동 증가(auto-increment)
    private Long rno;

    private String text;

    private String replyer;

    //foreign key (참조 무결성 유지)
    @ManyToOne
    private Board board;
}
