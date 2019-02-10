package by.pankov.votingdemo.service;

import by.pankov.votingdemo.dao.VotingTopicDao;
import by.pankov.votingdemo.entity.VotingTopic;
import by.pankov.votingdemo.service.interfaces.VotingTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VotingTopicServiceImpl implements VotingTopicService {

    private final VotingTopicDao votingTopicDao;

    @Autowired
    public VotingTopicServiceImpl(VotingTopicDao votingTopicDao) {
        this.votingTopicDao = votingTopicDao;
    }

    public VotingTopic save(VotingTopic votingTopic) {
        return votingTopicDao.save(votingTopic);
    }

    public VotingTopic findById(Long id){
        return  votingTopicDao.findById(id).get();
    }

    public List<VotingTopic> findAll(){
        List<VotingTopic> topics = new ArrayList<>();
        votingTopicDao.findAll().forEach(topics::add);
        return topics;
    }
}
