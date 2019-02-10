package by.pankov.votingdemo.dao;

import by.pankov.votingdemo.entity.Voter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoterDao extends CrudRepository<Voter, Long> {

    List<Voter> findByEmail(String s);

    }
