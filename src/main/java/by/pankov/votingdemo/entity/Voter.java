package by.pankov.votingdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true, exclude = "topics")
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "voter", schema = "topic_storage")
public class Voter extends BaseEntity<Long> {

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany
    @JoinTable(name = "voter_voting_topic", schema = "topic_storage",
    joinColumns = {@JoinColumn(name = "voter_id")},
    inverseJoinColumns = {@JoinColumn(name = "voting_topic_id")})
    private Set<VotingTopic> topics = new HashSet<>();
}
