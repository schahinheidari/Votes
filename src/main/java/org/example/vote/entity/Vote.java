package org.example.vote.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Vote {

    @EmbeddedId
    private VoteId pk;
    private Boolean upvote;
}
