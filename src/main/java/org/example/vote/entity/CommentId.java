package org.example.vote.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class CommentId implements Serializable {

    private static final long serialVersionUID = 3690211290276882371L;
    @ManyToOne
    private User user;
    @ManyToOne
    private Feature feature;
}
