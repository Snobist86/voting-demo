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
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "votingTopic", schema = "topic_storage")
public class VotingTopic extends BaseEntity<Long> {

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "activity")
    @Enumerated(EnumType.STRING)
    private Activity activity;

    @OneToMany(mappedBy = "votingTopic", fetch = FetchType.LAZY)
    private Set<Option> options = new HashSet<>();

    @ManyToMany(mappedBy = "topics", fetch = FetchType.LAZY)
    private Set<Voter> voters = new HashSet<>();
}
