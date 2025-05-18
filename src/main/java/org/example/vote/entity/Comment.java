package org.example.vote.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Comment {

    @EmbeddedId
    private CommentId pk;
    @Column(length = 5000)
    private String content;
}
