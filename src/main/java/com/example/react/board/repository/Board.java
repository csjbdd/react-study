package com.example.react.board.repository;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "board")
@DynamicInsert
@DynamicUpdate
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "member_no")
    private Integer memberNo;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "counts")
    private Integer counts;
    @Builder
    public Board(String type, String title, String contents, Integer memberNo, Date createdTime, Date updatedTime, Integer likes, Integer counts) {
        this.type = type;
        this.title = title;
        this.contents = contents;
        this.memberNo = memberNo;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.likes = likes;
        this.counts = counts;
    }

    public Board() {
    }
}
