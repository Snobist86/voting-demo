package by.pankov.votingdemo.service;

import by.pankov.votingdemo.dao.VoterDao;
import by.pankov.votingdemo.dto.VoterDto;
import by.pankov.votingdemo.entity.Voter;
import by.pankov.votingdemo.service.interfaces.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {

    private final VoterDao voterDao;

    @Autowired
    public VoterServiceImpl(VoterDao voterDao) {
        this.voterDao = voterDao;
    }

    public void save(Voter voter) {
       voterDao.save(voter);
    }

    public VoterDto findByEmail(String email){
        return voterDao.findByEmail(email).stream()
                .map(it -> new VoterDto(it.getId(), it.getEmail(), it.getRole()))
                .findFirst()
                .orElse(null);
    }
}
