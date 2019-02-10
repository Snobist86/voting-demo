package by.pankov.votingdemo.dao;

import by.pankov.votingdemo.entity.VotingTopic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingTopicDao extends CrudRepository<VotingTopic, Long> {
}
