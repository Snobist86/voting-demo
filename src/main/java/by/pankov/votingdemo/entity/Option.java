package by.pankov.votingdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "option", schema = "topic_storage")
public class Option extends BaseEntity<Long> {

    @Column(name = "text_option", nullable = false)
    private String textOption;

    @Column(name = "value", nullable = false, columnDefinition = "int default 0")
    private Integer value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voting_topic_id")
    private VotingTopic votingTopic;
}
